package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17044ak;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17045al;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17046am;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.bz */
/* compiled from: PG */
public final /* synthetic */ class C122267bz implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122272cd f339039a;

    /* renamed from: b */
    public final /* synthetic */ String f339040b;

    /* renamed from: c */
    public final /* synthetic */ C17044ak f339041c;

    public /* synthetic */ C122267bz(C122272cd cdVar, String str, C17044ak akVar) {
        this.f339039a = cdVar;
        this.f339040b = str;
        this.f339041c = akVar;
    }

    public final C60870cx apply(Object obj) {
        C122272cd cdVar = this.f339039a;
        String str = this.f339040b;
        C17044ak akVar = this.f339041c;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return cdVar.mo105582b(akVar, str);
        }
        C17045al alVar = (C17045al) C17046am.f49655c.createBuilder();
        C29690f fVar = (C29690f) optional.get();
        alVar.copyOnWrite();
        C17046am amVar = (C17046am) alVar.instance;
        fVar.getClass();
        amVar.f49658b = fVar;
        amVar.f49657a |= 1;
        return C60856cj.m92900i((C17046am) alVar.build());
    }
}
