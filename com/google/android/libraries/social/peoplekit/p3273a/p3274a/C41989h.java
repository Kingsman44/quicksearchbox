package com.google.android.libraries.social.peoplekit.p3273a.p3274a;

import android.widget.EditText;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.p3282d.C42088a;
import com.google.android.libraries.social.peoplekit.common.p3282d.C42089b;

/* renamed from: com.google.android.libraries.social.peoplekit.a.a.h */
/* compiled from: PG */
final class C41989h implements C42088a {

    /* renamed from: a */
    final /* synthetic */ PeopleKitDataLayer f109640a;

    /* renamed from: b */
    final /* synthetic */ C42089b f109641b;

    /* renamed from: c */
    final /* synthetic */ C41994m f109642c;

    public C41989h(C41994m mVar, PeopleKitDataLayer peopleKitDataLayer, C42089b bVar) {
        this.f109642c = mVar;
        this.f109640a = peopleKitDataLayer;
        this.f109641b = bVar;
    }

    /* renamed from: a */
    public final void mo44411a() {
        if (!this.f109641b.mo44602e()) {
            this.f109642c.f109651b.mo44439c();
        }
    }

    /* renamed from: b */
    public final void mo44412b() {
        this.f109642c.f109651b.mo44439c();
        EditText editText = this.f109642c.f109654e;
        if (editText != null) {
            this.f109640a.mo44663h(editText.getText().toString());
        }
    }
}
