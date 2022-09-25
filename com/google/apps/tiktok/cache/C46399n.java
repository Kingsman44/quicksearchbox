package com.google.apps.tiktok.cache;

import com.google.common.base.C58838bb;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.apps.tiktok.cache.n */
/* compiled from: PG */
final class C46399n {

    /* renamed from: a */
    public final int f121445a;

    /* renamed from: b */
    public final long f121446b;

    /* renamed from: c */
    public final MessageLite f121447c;

    /* renamed from: d */
    public final MessageLite f121448d;

    public C46399n(MessageLite messageLite, MessageLite messageLite2, long j) {
        C58838bb.m90866a(messageLite, "Cannot cache a null key");
        C58838bb.m90866a(messageLite2, "Cannot cache a null value");
        boolean z = true;
        C58838bb.m90871f(messageLite.getSerializedSize() <= 1024, "Key Message exceeds 1KiB limit. Was %s bytes", messageLite.getSerializedSize());
        C58838bb.m90871f(messageLite2.getSerializedSize() > 2000000 ? false : z, "Value Message exceeds 2MiB limit. Was %s bytes", messageLite2.getSerializedSize());
        this.f121445a = messageLite.getSerializedSize() + messageLite2.getSerializedSize();
        this.f121446b = j;
        this.f121447c = messageLite;
        this.f121448d = messageLite2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C46370ah mo50372a() {
        return new C46370ah(this.f121448d, this.f121446b);
    }
}
