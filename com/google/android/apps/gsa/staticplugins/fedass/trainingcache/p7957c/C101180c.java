package com.google.android.apps.gsa.staticplugins.fedass.trainingcache.p7957c;

import com.google.android.apps.search.fedora.p10099e.C132800h;
import com.google.android.apps.search.fedora.p10099e.C132815w;
import com.google.android.apps.search.fedora.p10099e.C132818z;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19418v;
import com.google.android.libraries.assistant.trainingcache.p1617b.C19437i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.trainingcache.c.c */
/* compiled from: PG */
public final /* synthetic */ class C101180c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C101196s f282430a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f282431b;

    /* renamed from: c */
    public final /* synthetic */ int f282432c;

    /* renamed from: d */
    public final /* synthetic */ int f282433d;

    public /* synthetic */ C101180c(C101196s sVar, int i, byte[] bArr, int i2) {
        this.f282430a = sVar;
        this.f282432c = i;
        this.f282431b = bArr;
        this.f282433d = i2;
    }

    public final C60870cx apply(Object obj) {
        C101196s sVar = this.f282430a;
        int i = this.f282432c;
        byte[] bArr = this.f282431b;
        int i2 = this.f282433d;
        C132818z zVar = ((C132800h) obj).f362336d;
        if (zVar == null) {
            zVar = C132818z.f362393h;
        }
        C132815w wVar = zVar.f362397c;
        if (wVar == null) {
            wVar = C132815w.f362363x;
        }
        if (wVar.f362385u) {
            C59104x b = C101196s.f282451a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "TrainingCacheConnection");
            ((C59052c) ((C59052c) b).mo56372aa(19871)).mo56386p("Using the TNG training cache from Classic.");
            ((C19437i) sVar.f282455e.mo17428b()).mo24627b(3);
            return ((C19418v) sVar.f282453c.mo17428b()).mo24610a(i2, i, bArr);
        }
        C59104x b2 = C101196s.f282451a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "TrainingCacheConnection");
        ((C59052c) ((C59052c) b2).mo56372aa(19870)).mo56386p("on insertClientEvent classic().");
        ((C19437i) sVar.f282455e.mo17428b()).mo24627b(2);
        return sVar.mo92169m(new C101187j(i, bArr, i2));
    }
}
