package com.google.apps.tiktok.contrib.p3629c;

import com.google.protobuf.MessageLite;

/* renamed from: com.google.apps.tiktok.contrib.c.h */
/* compiled from: PG */
final class C46487h extends C46489j {

    /* renamed from: a */
    private final MessageLite f121635a;

    public C46487h(MessageLite messageLite) {
        this.f121635a = messageLite;
    }

    /* renamed from: a */
    public final MessageLite mo50486a() {
        return this.f121635a;
    }

    /* renamed from: b */
    public final int mo50487b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C46495p) {
            C46495p pVar = (C46495p) obj;
            if (pVar.mo50487b() != 1 || !this.f121635a.equals(pVar.mo50486a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f121635a.hashCode();
    }

    public final String toString() {
        String obj = this.f121635a.toString();
        return "TikTokArgument{proto=" + obj + "}";
    }
}
