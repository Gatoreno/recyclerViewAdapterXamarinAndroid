package crc64acd98a531d140318;


public class ContactAdapterViewHolder
	extends android.support.v7.widget.RecyclerView.ViewHolder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("ListAdapterPractice.Resources.DataSource.ContactAdapterViewHolder, ListAdapterPractice", ContactAdapterViewHolder.class, __md_methods);
	}


	public ContactAdapterViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == ContactAdapterViewHolder.class)
			mono.android.TypeManager.Activate ("ListAdapterPractice.Resources.DataSource.ContactAdapterViewHolder, ListAdapterPractice", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
