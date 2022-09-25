package com.google.android.libraries.search.assistant.notification.data;

import android.net.Uri;
import com.google.android.libraries.search.assistant.notification.data.MessageNotification;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.notification.data.b */
/* compiled from: PG */
public final class C34881b extends C34891l {

    /* renamed from: a */
    public Optional f92513a = Optional.empty();

    /* renamed from: b */
    public Optional f92514b = Optional.empty();

    /* renamed from: c */
    public Optional f92515c = Optional.empty();

    /* renamed from: d */
    public Optional f92516d = Optional.empty();

    /* renamed from: e */
    public Optional f92517e = Optional.empty();

    /* renamed from: f */
    public Optional f92518f = Optional.empty();

    /* renamed from: g */
    public Optional f92519g = Optional.empty();

    /* renamed from: h */
    public Optional f92520h = Optional.empty();

    /* renamed from: i */
    public Optional f92521i = Optional.empty();

    /* renamed from: j */
    public Optional f92522j = Optional.empty();

    /* renamed from: k */
    public Optional f92523k = Optional.empty();

    /* renamed from: l */
    public Optional f92524l = Optional.empty();

    /* renamed from: m */
    public Optional f92525m = Optional.empty();

    /* renamed from: n */
    public Optional f92526n = Optional.empty();

    /* renamed from: o */
    private String f92527o;

    /* renamed from: p */
    private String f92528p;

    /* renamed from: q */
    private Optional f92529q = Optional.empty();

    /* renamed from: r */
    private boolean f92530r;

    /* renamed from: s */
    private String f92531s;

    /* renamed from: t */
    private C58485gu f92532t;

    /* renamed from: u */
    private Optional f92533u = Optional.empty();

    /* renamed from: v */
    private CharSequence f92534v;

    /* renamed from: w */
    private byte f92535w;

    public C34881b() {
    }

    /* renamed from: a */
    public final MessageNotification mo39589a() {
        String str;
        String str2;
        String str3;
        C58485gu guVar;
        CharSequence charSequence;
        if (this.f92535w != 1 || (str = this.f92527o) == null || (str2 = this.f92528p) == null || (str3 = this.f92531s) == null || (guVar = this.f92532t) == null || (charSequence = this.f92534v) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f92527o == null) {
                sb.append(" appName");
            }
            if (this.f92528p == null) {
                sb.append(" packageName");
            }
            if (this.f92535w == 0) {
                sb.append(" doesAlert");
            }
            if (this.f92531s == null) {
                sb.append(" key");
            }
            if (this.f92532t == null) {
                sb.append(" groupMembers");
            }
            if (this.f92534v == null) {
                sb.append(" senderName");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        AutoValue_MessageNotification autoValue_MessageNotification = r3;
        AutoValue_MessageNotification autoValue_MessageNotification2 = new AutoValue_MessageNotification(str, str2, this.f92513a, this.f92514b, this.f92529q, this.f92530r, str3, this.f92515c, this.f92516d, this.f92517e, guVar, this.f92518f, this.f92519g, this.f92520h, this.f92521i, this.f92522j, this.f92523k, this.f92524l, this.f92533u, charSequence, this.f92525m, this.f92526n);
        return autoValue_MessageNotification;
    }

    /* renamed from: b */
    public final void mo39590b(MessageNotification.Actions actions) {
        this.f92525m = Optional.m71637of(actions);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo39591c(Uri uri) {
        this.f92529q = Optional.m71637of(uri);
    }

    /* renamed from: d */
    public final void mo39592d(C58485gu guVar) {
        if (guVar != null) {
            this.f92532t = guVar;
            return;
        }
        throw new NullPointerException("Null groupMembers");
    }

    /* renamed from: e */
    public final /* synthetic */ void mo39593e(Long l) {
        this.f92515c = Optional.m71637of(l);
    }

    /* renamed from: f */
    public final void mo39594f(CharSequence charSequence) {
        if (charSequence != null) {
            this.f92534v = charSequence;
            return;
        }
        throw new NullPointerException("Null senderName");
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo39595g(String str) {
        if (str != null) {
            this.f92527o = str;
            return;
        }
        throw new NullPointerException("Null appName");
    }

    /* renamed from: h */
    public final /* synthetic */ void mo39596h(String str) {
        this.f92514b = Optional.m71637of(str);
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo39597i(boolean z) {
        this.f92530r = z;
        this.f92535w = 1;
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo39598j(String str) {
        if (str != null) {
            this.f92531s = str;
            return;
        }
        throw new NullPointerException("Null key");
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo39599k(String str) {
        if (str != null) {
            this.f92528p = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    public C34881b(MessageNotification messageNotification) {
        this.f92527o = messageNotification.mo39563t();
        this.f92528p = messageNotification.mo39566v();
        this.f92513a = messageNotification.mo39545d();
        this.f92514b = messageNotification.mo39546e();
        this.f92529q = messageNotification.mo39548f();
        this.f92530r = messageNotification.mo39567w();
        this.f92531s = messageNotification.mo39565u();
        this.f92515c = messageNotification.mo39561r();
        this.f92516d = messageNotification.mo39549g();
        this.f92517e = messageNotification.mo39554k();
        this.f92532t = messageNotification.mo39543b();
        this.f92518f = messageNotification.mo39557n();
        this.f92519g = messageNotification.mo39558o();
        this.f92520h = messageNotification.mo39555l();
        this.f92521i = messageNotification.mo39560q();
        this.f92522j = messageNotification.mo39553j();
        this.f92523k = messageNotification.mo39552i();
        this.f92524l = messageNotification.mo39550h();
        this.f92533u = messageNotification.mo39556m();
        this.f92534v = messageNotification.mo39562s();
        this.f92525m = messageNotification.mo39544c();
        this.f92526n = messageNotification.mo39559p();
        this.f92535w = 1;
    }
}
