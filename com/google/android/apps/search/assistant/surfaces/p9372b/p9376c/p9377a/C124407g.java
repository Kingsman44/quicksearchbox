package com.google.android.apps.search.assistant.surfaces.p9372b.p9376c.p9377a;

import android.util.Base64;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32817bl;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32818bm;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.knowledge.p4671b.C61820m;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.c.a.g */
/* compiled from: PG */
public final /* synthetic */ class C124407g implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C124407g f343356a = new C124407g();

    private /* synthetic */ C124407g() {
    }

    public final Object apply(Object obj) {
        C59071e eVar = C124408h.f343357a;
        C32817bl blVar = (C32817bl) C32818bm.f88003c.createBuilder();
        byte[] byteArray = ((C61820m) obj).toByteArray();
        try {
            C63087y v = C63088z.m96150v();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(v);
            gZIPOutputStream.write(byteArray, 0, byteArray.length);
            gZIPOutputStream.close();
            String encodeToString = Base64.encodeToString(v.mo59165b().mo59174N(), 11);
            blVar.copyOnWrite();
            C32818bm bmVar = (C32818bm) blVar.instance;
            encodeToString.getClass();
            bmVar.f88005a |= 1;
            bmVar.f88006b = encodeToString;
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) C124408h.f343357a.mo56225c()).mo56382g(e)).mo56372aa(37028)).mo56386p("Encoding and compression failed for optIncontext");
        }
        C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
        auVar.copyOnWrite();
        C32801aw awVar = (C32801aw) auVar.instance;
        C32818bm bmVar2 = (C32818bm) blVar.build();
        bmVar2.getClass();
        awVar.f87981b = bmVar2;
        awVar.f87980a = 4;
        return (C32801aw) auVar.build();
    }
}
