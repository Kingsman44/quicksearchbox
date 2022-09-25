package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124551g;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.av */
/* compiled from: PG */
public final /* synthetic */ class C9576av implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C9619ck f33175a;

    /* renamed from: b */
    public final /* synthetic */ String f33176b;

    /* renamed from: c */
    public final /* synthetic */ String f33177c;

    /* renamed from: d */
    public final /* synthetic */ C124551g f33178d;

    public /* synthetic */ C9576av(C9619ck ckVar, String str, String str2, C124551g gVar) {
        this.f33175a = ckVar;
        this.f33176b = str;
        this.f33177c = str2;
        this.f33178d = gVar;
    }

    public final C60870cx apply(Object obj) {
        C9619ck ckVar = this.f33175a;
        String str = this.f33176b;
        String str2 = this.f33177c;
        C124551g gVar = this.f33178d;
        for (C124548d dVar : (List) obj) {
            if (dVar.mo106518p(str).f343764b.equals(str2)) {
                ckVar.f33286t = dVar.mo106475P();
                return ckVar.f33277k.mo83409o(ckVar.f33286t);
            }
        }
        throw gVar;
    }
}
