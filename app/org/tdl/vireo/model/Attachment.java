package org.tdl.vireo.model;

import java.io.File;

/**
 * A file attachment associated with a particular submission such as the primary
 * document, supplemental content, or feedback. The metadata about an
 * attachment, it's name, or mimetype, may be changed but the contents of the
 * file is immutable. If you need to modify the attachments contents then just
 * delete the attachment and create a new document for the updated content.
 * 
 * @author <a href="http://www.scottphillips.com">Scott Phillips</a>
 */
public interface Attachment extends AbstractModel {

	/**
	 * The name of the file will be how the file is named on disk with an
	 * extension following the normal conventions of file names. Some examples
	 * are: "myresearch.pdf", "survey_data.xsls", etc...
	 * 
	 * @return The technical name of the file.
	 */
	public String getName();

	/**
	 * @param name
	 *            The new technical name of the file.
	 */
	public void setName(String name);

	/**
	 * @return The attachment types.
	 */
	public AttachmentType getType();

	/**
	 * @param type
	 *            The new type of this attachment.
	 */
	public void setType(AttachmentType type);

	/**
	 * @return The mimetype of the file.
	 */
	public String getMimeType();

	/**
	 * @param mimeType
	 *            The new mimetype of the file.
	 */
	public void setMimeType(String mimeType);

	/**
	 * @return The file size measured in bytes.
	 */
	public long getSize();

	/**
	 * @return The displayable size of this file, such as "12 MB".
	 */
	public String getDisplaySize();

	/**
	 * @return The file.
	 */
	public File getFile();

}
