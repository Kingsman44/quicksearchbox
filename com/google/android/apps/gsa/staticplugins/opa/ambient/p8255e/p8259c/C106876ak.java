package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C63088z;
import java.util.IdentityHashMap;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.ak */
/* compiled from: PG */
public final /* synthetic */ class C106876ak implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C106878am f297771a;

    public /* synthetic */ C106876ak(C106878am amVar) {
        this.f297771a = amVar;
    }

    public final void accept(Object obj, Object obj2) {
        C106878am amVar = this.f297771a;
        IdentityHashMap identityHashMap = (IdentityHashMap) obj;
        C106868ac acVar = (C106868ac) obj2;
        for (C63088z N : acVar.mo95704e().mo56112g()) {
            byte[] N2 = N.mo59174N();
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(N2, 0, N2.length);
            if (decodeByteArray != null) {
                identityHashMap.put(acVar, decodeByteArray);
            } else {
                ((C58970a) ((C58970a) amVar.f297775c.mo56225c()).mo56372aa(23376)).mo56389s("%s has invalid image content.", acVar.mo95708i());
            }
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
