package com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8273g;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.h.g.m */
/* compiled from: PG */
public final /* synthetic */ class C107073m implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C107076p f298123a;

    public /* synthetic */ C107073m(C107076p pVar) {
        this.f298123a = pVar;
    }

    public final Object apply(Object obj) {
        int length;
        C107076p pVar = this.f298123a;
        byte[] bArr = (byte[]) obj;
        if (bArr == null || (length = bArr.length) == 0) {
            ((C58970a) ((C58970a) pVar.f298127a.mo56225c()).mo56372aa(23480)).mo56386p("#bytesToByteString: Loaded empty bytes");
            return C63088z.f170246b;
        }
        ((C58970a) ((C58970a) pVar.f298127a.mo56224b()).mo56372aa(23481)).mo56387q("#bytesToByteString: Loaded %d bytes.", length);
        return C63088z.m96139A(bArr);
    }
}
