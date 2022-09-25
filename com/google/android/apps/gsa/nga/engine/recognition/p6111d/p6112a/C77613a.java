package com.google.android.apps.gsa.nga.engine.recognition.p6111d.p6112a;

import android.net.Uri;
import com.google.android.apps.gsa.nga.engine.recognition.p6111d.C77616b;
import com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.d.a.a */
/* compiled from: PG */
public final /* synthetic */ class C77613a implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C77614b f213829a;

    /* renamed from: b */
    public final /* synthetic */ HotwordDetectedEventData f213830b;

    public /* synthetic */ C77613a(C77614b bVar, HotwordDetectedEventData hotwordDetectedEventData) {
        this.f213829a = bVar;
        this.f213830b = hotwordDetectedEventData;
    }

    public final void run() {
        C77614b bVar = this.f213829a;
        HotwordDetectedEventData hotwordDetectedEventData = this.f213830b;
        AtomicReference atomicReference = bVar.f213833c;
        while (!atomicReference.compareAndSet(hotwordDetectedEventData, (Object) null)) {
            if (atomicReference.get() != hotwordDetectedEventData) {
                return;
            }
        }
        ((C58970a) ((C58970a) C77614b.f213831a.mo56226d()).mo56372aa(4333)).mo56386p("Disposing store hotword result");
        C77616b bVar2 = bVar.f213832b;
        Uri uri = hotwordDetectedEventData.f253054b;
        if (uri != null) {
            bVar2.mo72745a(uri);
        }
    }
}
