package com.google.android.libraries.logging.p2182b.p2183a.p2184a;

import com.google.android.gms.clearcut.C143623ad;
import com.google.common.p4552o.C60321oe;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.logging.b.a.a.a */
/* compiled from: PG */
public final class C28262a extends C28264c {

    /* renamed from: a */
    public C60321oe f76916a;

    /* renamed from: b */
    public Integer f76917b;

    /* renamed from: c */
    public C143623ad f76918c;

    /* renamed from: d */
    public int[] f76919d;

    /* renamed from: e */
    public int[] f76920e;

    /* renamed from: f */
    private String f76921f;

    /* renamed from: g */
    private MessageLite f76922g;

    /* renamed from: h */
    private int f76923h;

    /* renamed from: a */
    public final C28265d mo33754a() {
        MessageLite messageLite;
        int i;
        String str = this.f76921f;
        if (str != null && (messageLite = this.f76922g) != null && (i = this.f76923h) != 0) {
            return new C28263b(str, messageLite, this.f76916a, this.f76917b, i, this.f76918c, this.f76919d, this.f76920e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f76921f == null) {
            sb.append(" logSource");
        }
        if (this.f76922g == null) {
            sb.append(" message");
        }
        if (this.f76923h == 0) {
            sb.append(" qosTier");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo33755b(String str) {
        if (str != null) {
            this.f76921f = str;
            return;
        }
        throw new NullPointerException("Null logSource");
    }

    /* renamed from: c */
    public final void mo33756c(MessageLite messageLite) {
        if (messageLite != null) {
            this.f76922g = messageLite;
            return;
        }
        throw new NullPointerException("Null message");
    }

    /* renamed from: d */
    public final void mo33757d(int i) {
        if (i != 0) {
            this.f76923h = i;
            return;
        }
        throw new NullPointerException("Null qosTier");
    }
}
