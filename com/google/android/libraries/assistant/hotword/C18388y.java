package com.google.android.libraries.assistant.hotword;

import android.os.RemoteException;
import com.google.android.apps.gsa.nga.api.a.g;
import com.google.android.apps.gsa.nga.api.a.h;
import com.google.android.apps.gsa.nga.api.a.i;
import com.google.android.apps.gsa.nga.api.a.x;
import com.google.android.apps.gsa.nga.api.a.y;
import com.google.android.apps.gsa.nga.shared.p6339f.C81066e;
import com.google.android.apps.gsa.nga.shared.p6339f.p6340a.C81026c;
import com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81060a;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.assistant.hotword.y */
/* compiled from: PG */
public final /* synthetic */ class C18388y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ HotwordResult f52213a;

    /* renamed from: b */
    public final /* synthetic */ C81066e f52214b;

    /* renamed from: c */
    public final /* synthetic */ C18332ae f52215c;

    public /* synthetic */ C18388y(C18332ae aeVar, HotwordResult hotwordResult, C81066e eVar) {
        this.f52215c = aeVar;
        this.f52213a = hotwordResult;
        this.f52214b = eVar;
    }

    public final void run() {
        h hVar;
        C18332ae aeVar = this.f52215c;
        HotwordResult hotwordResult = this.f52213a;
        C81066e eVar = this.f52214b;
        int i = C18328aa.f51970h;
        aeVar.mo23786a(hotwordResult);
        if (eVar != null) {
            C81026c a = eVar.mo74805a();
            try {
                g createBuilder = i.c.createBuilder();
                if (hotwordResult == null) {
                    hVar = h.e;
                } else if (!hotwordResult.mo84680E()) {
                    hVar = h.d;
                } else if (!hotwordResult.mo84676A()) {
                    hVar = h.c;
                } else {
                    hVar = h.b;
                }
                createBuilder.copyOnWrite();
                createBuilder.instance.a = hVar.getNumber();
                if (hotwordResult != null) {
                    x createBuilder2 = y.i.createBuilder();
                    if (hotwordResult.mo84698p().mo56113h()) {
                        C63088z A = C63088z.m96139A((byte[]) hotwordResult.mo84698p().mo56107c());
                        createBuilder2.copyOnWrite();
                        createBuilder2.instance.g = A;
                    }
                    int j = hotwordResult.mo84692j();
                    createBuilder2.copyOnWrite();
                    createBuilder2.instance.a = j;
                    boolean A2 = hotwordResult.mo84676A();
                    createBuilder2.copyOnWrite();
                    createBuilder2.instance.b = A2;
                    float c = hotwordResult.mo84683c();
                    createBuilder2.copyOnWrite();
                    createBuilder2.instance.c = c;
                    float d = hotwordResult.mo84684d();
                    createBuilder2.copyOnWrite();
                    createBuilder2.instance.d = d;
                    float b = hotwordResult.mo84682b();
                    createBuilder2.copyOnWrite();
                    createBuilder2.instance.e = b;
                    boolean E = hotwordResult.mo84680E();
                    createBuilder2.copyOnWrite();
                    createBuilder2.instance.h = E;
                    y build = createBuilder2.build();
                    createBuilder.copyOnWrite();
                    build.getClass();
                    createBuilder.instance.b = build;
                }
                a.mo74812a(createBuilder.build().toByteArray());
            } catch (RemoteException e) {
                ((C58970a) ((C58970a) ((C58970a) C81060a.f222174a.mo56226d()).mo56382g(e)).mo56372aa(5812)).mo56386p("Failed to accept bisto invocation");
            }
        }
    }
}
