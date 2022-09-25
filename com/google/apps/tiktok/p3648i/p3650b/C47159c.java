package com.google.apps.tiktok.p3648i.p3650b;

import com.google.android.libraries.storage.protostore.C43007j;
import com.google.apps.tiktok.p3648i.p3649a.C47153d;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.apps.tiktok.i.b.c */
/* compiled from: PG */
public final class C47159c extends C47163g {

    /* renamed from: a */
    public String f122793a;

    /* renamed from: b */
    public C47153d f122794b;

    /* renamed from: c */
    public C43007j f122795c;

    /* renamed from: d */
    public C60887da f122796d;

    /* renamed from: e */
    public C47162f f122797e;

    /* renamed from: f */
    private MessageLite f122798f;

    /* renamed from: g */
    private C58480gp f122799g;

    /* renamed from: h */
    private C58485gu f122800h;

    /* renamed from: a */
    public final C47164h mo51067a() {
        MessageLite messageLite;
        C47153d dVar;
        C43007j jVar;
        C58480gp gpVar = this.f122799g;
        if (gpVar != null) {
            this.f122800h = gpVar.mo55394f();
        } else if (this.f122800h == null) {
            this.f122800h = C58485gu.m89845m();
        }
        String str = this.f122793a;
        if (str != null && (messageLite = this.f122798f) != null && (dVar = this.f122794b) != null && (jVar = this.f122795c) != null) {
            return new C47160d(str, messageLite, dVar, this.f122800h, jVar, this.f122796d, this.f122797e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f122793a == null) {
            sb.append(" name");
        }
        if (this.f122798f == null) {
            sb.append(" schema");
        }
        if (this.f122794b == null) {
            sb.append(" storage");
        }
        if (this.f122795c == null) {
            sb.append(" handler");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final C58480gp mo51068b() {
        if (this.f122799g == null) {
            this.f122799g = C58485gu.m89837e();
        }
        return this.f122799g;
    }

    /* renamed from: c */
    public final void mo51069c(MessageLite messageLite) {
        if (messageLite != null) {
            this.f122798f = messageLite;
            return;
        }
        throw new NullPointerException("Null schema");
    }
}
