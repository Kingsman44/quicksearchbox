package com.google.android.libraries.p579ar.faceviewer.p580a.p584d;

import com.google.android.libraries.p579ar.faceviewer.p587b.C10647l;
import com.google.android.libraries.p579ar.faceviewer.p587b.C10648m;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10652c;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10653d;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10657h;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.d.a */
/* compiled from: PG */
public final class C10578a implements C10652c, C10657h, C10648m {

    /* renamed from: a */
    public C10648m f35395a;

    /* renamed from: b */
    public int f35396b = 1;

    /* renamed from: c */
    private final C10647l f35397c;

    public C10578a(C10647l lVar, C10648m mVar) {
        this.f35397c = lVar;
        this.f35395a = mVar;
    }

    /* renamed from: a */
    public final void mo18630a() {
        throw null;
    }

    /* renamed from: b */
    public final void mo18627b() {
        this.f35395a = null;
    }

    /* renamed from: c */
    public final void mo18628c(C10653d dVar) {
    }

    /* renamed from: d */
    public final void mo18639d() {
        if (this.f35397c.f35540a.getContext().checkSelfPermission("android.permission.CAMERA") == 0) {
            this.f35396b = 3;
            C10648m mVar = this.f35395a;
            if (mVar != null) {
                mVar.mo18630a();
                return;
            }
            return;
        }
        C10647l lVar = this.f35397c;
        lVar.f35541b = this;
        lVar.f35540a.requestPermissions(new String[]{"android.permission.CAMERA"}, 1);
    }
}
