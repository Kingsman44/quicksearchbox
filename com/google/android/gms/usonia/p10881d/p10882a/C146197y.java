package com.google.android.gms.usonia.p10881d.p10882a;

import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.usonia.PeerAddress;
import com.google.android.gms.usonia.auth.internal.C146151x;
import com.google.android.gms.usonia.metrics.internal.C146293a;
import com.google.android.gms.usonia.metrics.internal.C146298f;
import com.google.android.gms.usonia.p10879c.C146167c;
import com.google.android.gms.usonia.p10881d.C146202f;
import com.google.android.gms.usonia.p10881d.C146203g;
import com.google.android.gms.usonia.p10881d.C146204h;
import com.google.android.gms.usonia.p10881d.C146206j;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60888db;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import p3186j$.util.DesugarCollections;

/* renamed from: com.google.android.gms.usonia.d.a.y */
/* compiled from: PG */
public final class C146197y extends C146206j implements C146167c {

    /* renamed from: a */
    public static final C59071e f395000a = C59071e.m91332i("com.google.android.gms.usonia.d.a.y");

    /* renamed from: b */
    public final C146203g f395001b;

    /* renamed from: c */
    public final C146204h f395002c;

    /* renamed from: d */
    public final C146183k f395003d;

    /* renamed from: e */
    private final Map f395004e;

    /* renamed from: f */
    private final C146151x f395005f;

    /* renamed from: g */
    private final C60888db f395006g;

    /* renamed from: h */
    private final C146298f f395007h;

    /* renamed from: i */
    private C146006ab f395008i = null;

    /* renamed from: j */
    private Long f395009j = null;

    /* renamed from: k */
    private boolean f395010k = false;

    public C146197y(C146183k kVar, C146203g gVar, C146151x xVar, C60888db dbVar, C146298f fVar) {
        this.f395003d = kVar;
        this.f395001b = gVar;
        this.f395005f = xVar;
        this.f395002c = new C146204h();
        this.f395004e = DesugarCollections.synchronizedMap(new HashMap());
        this.f395006g = dbVar;
        this.f395007h = fVar;
    }

    /* renamed from: a */
    public final void mo106359a(PeerAddress[] peerAddressArr, PeerAddress[] peerAddressArr2) {
        for (PeerAddress peerAddress : peerAddressArr2) {
            C146202f fVar = (C146202f) this.f395004e.get(peerAddress);
            if (fVar != null) {
                fVar.mo122745e();
            }
            this.f395004e.remove(peerAddress);
        }
        for (PeerAddress peerAddress2 : peerAddressArr) {
            C146202f a = this.f395001b.mo106373a(peerAddress2);
            this.f395004e.put(peerAddress2, a);
            C146006ab abVar = this.f395008i;
            abVar.getClass();
            abVar.mo122495n(this.f395006g, new C146192t(this, peerAddress2, a));
        }
        this.f395004e.isEmpty();
    }

    /* renamed from: b */
    public final void mo122742b() {
        this.f395009j = Long.valueOf(System.currentTimeMillis());
        try {
            this.f395008i = this.f395005f.mo122688d().mo122482a(C60826bg.f164896a, C146193u.f394996a);
            C146183k kVar = this.f395003d;
            kVar.f394976b.mo122730a(this.f395001b.mo106374b(), this).mo122495n(this.f395006g, new C146194v(this));
        } catch (IllegalStateException e) {
            throw new IllegalStateException("Attempted to start an Ubersubscriber before authentication was initialized. Client applications must call sslContextProvider::initialize() before attempting RPC calls.", e);
        }
    }

    /* renamed from: c */
    public final void mo122743c() {
        for (PeerAddress peerAddress : this.f395004e.keySet()) {
            C146183k kVar = this.f395003d;
            C146202f fVar = (C146202f) this.f395004e.get(peerAddress);
            if (fVar != null) {
                kVar.mo122737a(peerAddress, fVar, new C146195w(peerAddress));
            } else {
                throw new NoSuchElementException("Subscriber not found for peer address");
            }
        }
        this.f395004e.clear();
        C146183k kVar2 = this.f395003d;
        kVar2.f394976b.mo122731b(this.f395001b.mo106374b(), this).mo122495n(C60826bg.f164896a, new C146196x(this));
        this.f395010k = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo122744d() {
        if (!this.f395010k) {
            this.f395010k = true;
            C146298f fVar = this.f395007h;
            C146293a aVar = C146293a.TRAIT_SUBSCRIBE_CLIENT_FIRST_SUBSCRIPTION_DELAY;
            String b = this.f395001b.mo106374b();
            long currentTimeMillis = System.currentTimeMillis();
            Long l = this.f395009j;
            l.getClass();
            fVar.mo122862c(aVar, b, currentTimeMillis - l.longValue());
        }
    }
}
