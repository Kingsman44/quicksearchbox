package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import com.google.android.apps.search.fedora.p10099e.C132795c;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.android.apps.search.fedora.p10099e.C132800h;
import com.google.android.apps.search.fedora.p10099e.C132815w;
import com.google.android.apps.search.fedora.p10099e.C132818z;
import com.google.common.base.C58817ah;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.y */
/* compiled from: PG */
public final /* synthetic */ class C100942y implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ ArrayList f281988a;

    /* renamed from: b */
    public final /* synthetic */ String f281989b;

    public /* synthetic */ C100942y(ArrayList arrayList, String str) {
        this.f281988a = arrayList;
        this.f281989b = str;
    }

    public final Object apply(Object obj) {
        ArrayList arrayList = this.f281988a;
        String str = this.f281989b;
        C132800h hVar = (C132800h) obj;
        C132818z zVar = hVar.f362336d;
        if (zVar == null) {
            zVar = C132818z.f362393h;
        }
        C132815w wVar = zVar.f362397c;
        if (wVar == null) {
            wVar = C132815w.f362363x;
        }
        if (wVar.f362378n) {
            C132798f fVar = hVar.f362335c;
            if (fVar == null) {
                fVar = C132798f.f362315o;
            }
            C132795c cVar = fVar.f362328l;
            if (cVar == null) {
                cVar = C132795c.f362303c;
            }
            if (cVar.f362306b) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
