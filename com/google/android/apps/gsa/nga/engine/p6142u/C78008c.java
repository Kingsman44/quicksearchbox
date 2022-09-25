package com.google.android.apps.gsa.nga.engine.p6142u;

import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82391dl;
import com.google.android.libraries.assistant.p1363c.p1382d.C17214d;
import com.google.android.libraries.assistant.p1363c.p1382d.p1383a.C17196a;
import com.google.android.libraries.assistant.p1363c.p1382d.p1383a.C17197b;
import com.google.android.libraries.gsa.p1870h.p1871a.p1872a.C22818a;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nga.engine.u.c */
/* compiled from: PG */
public final /* synthetic */ class C78008c implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C78016k f214837a;

    /* renamed from: b */
    public final /* synthetic */ C17197b f214838b;

    /* renamed from: c */
    public final /* synthetic */ C17214d f214839c;

    public /* synthetic */ C78008c(C78016k kVar, C17197b bVar, C17214d dVar) {
        this.f214837a = kVar;
        this.f214838b = bVar;
        this.f214839c = dVar;
    }

    public final void run() {
        C78016k kVar = this.f214837a;
        C17197b bVar = this.f214838b;
        C17214d dVar = this.f214839c;
        C83305i iVar = kVar.f214856d;
        String str = ((C17196a) bVar).f49938a;
        String name = dVar.name();
        if (name != null) {
            String str2 = (String) C22818a.f62831a.get(bVar);
            boolean z = false;
            if (str2 != null && kVar.f214858f.mo104323a().contains(str2)) {
                z = true;
            }
            iVar.mo75579d(new C82391dl("NGA_NATIVE_LIBRARY_LOADING_STATUS", str, z, name));
            return;
        }
        throw new NullPointerException("Null loadStatus");
    }
}
