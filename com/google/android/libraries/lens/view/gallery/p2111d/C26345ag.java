package com.google.android.libraries.lens.view.gallery.p2111d;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;

/* renamed from: com.google.android.libraries.lens.view.gallery.d.ag */
/* compiled from: PG */
public final class C26345ag extends C0673gh implements C26355aq {

    /* renamed from: d */
    public static final /* synthetic */ int f71618d = 0;

    /* renamed from: a */
    public final C26354ap f71619a;

    /* renamed from: b */
    public final Spinner f71620b = ((Spinner) this.itemView.findViewById(R.id.lens_gallery_folder_dropdown));

    /* renamed from: c */
    public final TextView f71621c = ((TextView) this.itemView.findViewById(R.id.lens_gallery_expand_folder_button));

    public C26345ag(ViewGroup viewGroup, C26354ap apVar) {
        super(apVar.mo31549a(R.layout.lens_gallery_section_folders, viewGroup));
        this.f71619a = apVar;
    }

    /* renamed from: a */
    public final void mo31534a() {
        this.f71621c.setOnClickListener((View.OnClickListener) null);
        if (this.f71621c.getVisibility() == 0) {
            C28306ab.m52929e(this.f71621c);
        }
    }
}
