package com.google.android.apps.gsa.search.core.google.p6790a;

import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9857y;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3917i.p3918a.C51300cp;
import com.google.assistant.p3897e.p3917i.p3918a.C51303cs;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62962ci;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.ak */
/* compiled from: PG */
public final /* synthetic */ class C85792ak implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C51303cs f231954a;

    public /* synthetic */ C85792ak(C51303cs csVar) {
        this.f231954a = csVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C51303cs csVar = this.f231954a;
        C9857y yVar = (C9857y) obj;
        C59071e eVar = C85799ar.f231968a;
        C9855w wVar = C9855w.STANDBY;
        C9855w a = C9855w.m24617a(yVar.f33886b);
        if (a == null) {
            a = C9855w.STANDBY;
        }
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            C51300cp cpVar = C51300cp.UNSPECIFIED_ASSISTANT_ON_LOCKSCREEN;
            csVar.copyOnWrite();
            C51334dw dwVar = (C51334dw) csVar.instance;
            C62962ci ciVar = C51334dw.f133657N;
            dwVar.f133666G = cpVar.f133549d;
            dwVar.f133688b |= 2048;
        } else if (ordinal == 1) {
            C51300cp cpVar2 = C51300cp.ASSISTANT_ON_LOCKSCREEN_DISALLOWED;
            csVar.copyOnWrite();
            C51334dw dwVar2 = (C51334dw) csVar.instance;
            C62962ci ciVar2 = C51334dw.f133657N;
            dwVar2.f133666G = cpVar2.f133549d;
            dwVar2.f133688b |= 2048;
        } else if (ordinal == 2) {
            C51300cp cpVar3 = C51300cp.ASSISTANT_ON_LOCKSCREEN_ALLOWED;
            csVar.copyOnWrite();
            C51334dw dwVar3 = (C51334dw) csVar.instance;
            C62962ci ciVar3 = C51334dw.f133657N;
            dwVar3.f133666G = cpVar3.f133549d;
            dwVar3.f133688b |= 2048;
        }
        return yVar;
    }
}
