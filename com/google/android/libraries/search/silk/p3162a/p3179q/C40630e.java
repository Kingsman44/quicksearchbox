package com.google.android.libraries.search.silk.p3162a.p3179q;

import android.content.Intent;
import android.net.Uri;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4320y.C56840e;

/* renamed from: com.google.android.libraries.search.silk.a.q.e */
/* compiled from: PG */
public final /* synthetic */ class C40630e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C40633h f106631a;

    /* renamed from: b */
    public final /* synthetic */ C56840e f106632b;

    public /* synthetic */ C40630e(C40633h hVar, C56840e eVar) {
        this.f106631a = hVar;
        this.f106632b = eVar;
    }

    public final C60870cx apply(Object obj) {
        C40633h hVar = this.f106631a;
        C56840e eVar = this.f106632b;
        Uri uri = (Uri) obj;
        if (uri == null) {
            return C40633h.m70397b("general_error", "Image Download for Share API returned a null image");
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/*");
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setFlags(268435456);
        intent.addFlags(1);
        hVar.f106637b.startActivity(C40633h.m70396a(intent, eVar.f151651b));
        return C60856cj.m92900i(C40633h.f106636a);
    }
}
