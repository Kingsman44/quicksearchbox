package com.google.apps.tiktok.cache;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62921ba;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.apps.tiktok.cache.p */
/* compiled from: PG */
public final class C46401p {

    /* renamed from: a */
    public final C21370a f121455a;

    /* renamed from: b */
    public final MessageLite f121456b;

    /* renamed from: c */
    public final C62921ba f121457c;

    /* renamed from: d */
    public ParcelableKeyValueStore f121458d;

    public C46401p(C21370a aVar, MessageLite messageLite, C62921ba baVar) {
        this.f121455a = aVar;
        this.f121456b = messageLite.getDefaultInstanceForType();
        this.f121457c = baVar;
    }

    /* renamed from: a */
    public final C46370ah mo50378a(MessageLite messageLite) {
        mo50379b();
        return this.f121458d.mo50327a(messageLite);
    }

    /* renamed from: b */
    public final void mo50379b() {
        C58838bb.m90884s(this.f121458d != null, "InstanceStateStore can only be accessed after onCreate() has run.");
    }

    /* renamed from: c */
    public final void mo50380c() {
        mo50379b();
        ParcelableKeyValueStore parcelableKeyValueStore = this.f121458d;
        synchronized (parcelableKeyValueStore.f121360a) {
            parcelableKeyValueStore.f121361b.clear();
        }
    }

    /* renamed from: d */
    public final void mo50381d(MessageLite messageLite, MessageLite messageLite2) {
        mo50379b();
        C58838bb.m90866a(messageLite, "Cannot write to store with a null key");
        C58838bb.m90866a(messageLite2, "Cannot write to store with a null value");
        this.f121458d.mo50329c(messageLite, new C46370ah(messageLite2, this.f121455a.mo26870b()));
    }

    /* renamed from: e */
    public final void mo50382e(MessageLite messageLite) {
        mo50379b();
        ParcelableKeyValueStore parcelableKeyValueStore = this.f121458d;
        synchronized (parcelableKeyValueStore.f121360a) {
            parcelableKeyValueStore.mo50328b(messageLite);
            parcelableKeyValueStore.f121361b.remove(messageLite);
        }
    }
}
