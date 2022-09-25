package com.google.android.libraries.assistant.p1363c.p1364a.p1365a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.libraries.assistant.p1363c.p1364a.p1365a.p1367b.C16939a;
import com.google.protobuf.C62910ar;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.c.a.a.g */
/* compiled from: PG */
public final class C16944g extends C16938b {

    /* renamed from: a */
    public Context f49493a;

    /* renamed from: b */
    public int f49494b;

    /* renamed from: c */
    public String f49495c;

    /* renamed from: d */
    public String f49496d;

    /* renamed from: e */
    public Bundle f49497e;

    /* renamed from: f */
    public C16939a f49498f;

    /* renamed from: g */
    public Optional f49499g = Optional.empty();

    /* renamed from: h */
    public Optional f49500h = Optional.empty();

    /* renamed from: i */
    public byte f49501i;

    /* renamed from: j */
    public C16932a f49502j;

    /* renamed from: k */
    public int f49503k;

    /* renamed from: l */
    private boolean f49504l;

    /* renamed from: m */
    private boolean f49505m;

    /* renamed from: n */
    private boolean f49506n;

    /* renamed from: o */
    private boolean f49507o;

    /* renamed from: p */
    private C62910ar f49508p;

    /* renamed from: a */
    public final C16940c mo23109a() {
        Context context;
        int i;
        String str;
        String str2;
        Bundle bundle;
        C16932a aVar;
        C62910ar arVar;
        if (this.f49501i != 31 || (context = this.f49493a) == null || (i = this.f49503k) == 0 || (str = this.f49495c) == null || (str2 = this.f49496d) == null || (bundle = this.f49497e) == null || (aVar = this.f49502j) == null || (arVar = this.f49508p) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f49493a == null) {
                sb.append(" context");
            }
            if (this.f49503k == 0) {
                sb.append(" loggingSource");
            }
            if ((this.f49501i & 1) == 0) {
                sb.append(" foregroundNotificationId");
            }
            if (this.f49495c == null) {
                sb.append(" foregroundNotificationChannel");
            }
            if (this.f49496d == null) {
                sb.append(" sessionIdentifier");
            }
            if (this.f49497e == null) {
                sb.append(" sessionMetadata");
            }
            if (this.f49502j == null) {
                sb.append(" customMediaHandler");
            }
            if ((this.f49501i & 2) == 0) {
                sb.append(" hideNotification");
            }
            if ((this.f49501i & 4) == 0) {
                sb.append(" enableMediaSession");
            }
            if ((this.f49501i & 8) == 0) {
                sb.append(" pauseAtEndOfMediaItems");
            }
            if ((this.f49501i & 16) == 0) {
                sb.append(" delayPreparingMedia");
            }
            if (this.f49508p == null) {
                sb.append(" progressMonitorInterval");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new C16945h(context, i, this.f49494b, str, str2, bundle, this.f49498f, this.f49499g, aVar, this.f49504l, this.f49505m, this.f49506n, this.f49507o, arVar, this.f49500h);
    }

    /* renamed from: b */
    public final void mo23110b(boolean z) {
        this.f49507o = z;
        this.f49501i = (byte) (this.f49501i | 16);
    }

    /* renamed from: c */
    public final void mo23111c() {
        this.f49505m = true;
        this.f49501i = (byte) (this.f49501i | 4);
    }

    /* renamed from: d */
    public final void mo23112d(boolean z) {
        this.f49504l = z;
        this.f49501i = (byte) (this.f49501i | 2);
    }

    /* renamed from: e */
    public final void mo23113e(boolean z) {
        this.f49506n = z;
        this.f49501i = (byte) (this.f49501i | 8);
    }

    /* renamed from: f */
    public final void mo23114f(C62910ar arVar) {
        if (arVar != null) {
            this.f49508p = arVar;
            return;
        }
        throw new NullPointerException("Null progressMonitorInterval");
    }
}
