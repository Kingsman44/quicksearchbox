package com.google.assistant.p3838ao.p3839a;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.ap.b.l;
import com.google.android.apps.gsa.nga.engine.ap.b.m;
import com.google.android.apps.gsa.nga.engine.p5949ap.p5950b.C75005n;
import com.google.assistant.p3838ao.p3839a.p3845e.C49528al;
import com.google.assistant.p3838ao.p3839a.p3845e.C49617h;
import com.google.assistant.p3838ao.p3839a.p3846f.C49642f;
import com.google.assistant.p3838ao.p3839a.p3847g.C49644a;
import com.google.assistant.p3838ao.p3839a.p3848h.C49661p;
import com.google.assistant.p3838ao.p3839a.p3848h.C49667v;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.assistant.ao.a.r */
/* compiled from: PG */
public abstract class C49692r {

    /* renamed from: a */
    private static final C58974d f128264a = C58974d.m91136j();

    /* renamed from: a */
    public abstract Context mo53240a();

    /* renamed from: b */
    public abstract C49644a mo53241b();

    /* renamed from: c */
    public abstract C49661p mo53242c();

    /* renamed from: d */
    public abstract C58528ij mo53243d();

    /* renamed from: e */
    public abstract C58528ij mo53244e();

    /* renamed from: f */
    public abstract C60950i mo53246f();

    /* renamed from: g */
    public abstract Optional mo53247g();

    /* renamed from: h */
    public abstract Optional mo53248h();

    /* renamed from: i */
    public abstract Optional mo53250i();

    /* renamed from: j */
    public abstract String mo53251j();

    /* renamed from: k */
    public abstract Locale mo53252k();

    /* renamed from: l */
    public abstract int mo53253l();

    /* renamed from: m */
    public abstract C75005n mo53254m();

    /* renamed from: n */
    public abstract l mo53255n();

    /* renamed from: o */
    public abstract m mo53256o();

    /* renamed from: p */
    public Optional mo53266p() {
        throw null;
    }

    /* renamed from: q */
    public final C49617h mo53330q() {
        if (!mo53248h().isPresent()) {
            return C49617h.CLIENT_ID_UNDEFINED;
        }
        C49617h a = C49617h.m85585a(((C49528al) mo53248h().get()).f127794b);
        if (a == null) {
            return C49617h.CLIENT_ID_UNDEFINED;
        }
        return a;
    }

    /* renamed from: r */
    public final Optional mo53331r() {
        if (mo53253l() != 7) {
            return Optional.empty();
        }
        C49667v f = mo53242c().mo53309f();
        if (f.f128182a.isEmpty()) {
            return Optional.empty();
        }
        return Optional.m71637of((C49642f) f.f128182a.get(0));
    }

    /* renamed from: s */
    public final String mo53332s(int i) {
        Icon createWithResource = Icon.createWithResource(mo53240a(), i);
        if (createWithResource.getType() == 4) {
            return createWithResource.getUri().toString();
        }
        if (createWithResource.getType() == 2) {
            return new Uri.Builder().scheme("android.resource").authority(createWithResource.getResPackage()).path(String.valueOf(createWithResource.getResId())).build().toString();
        }
        ((C58970a) ((C58970a) f128264a.mo56225c()).mo56372aa(54824)).mo56387q("Unexpected icon type: %s", createWithResource.getType());
        return BuildConfig.FLAVOR;
    }

    /* renamed from: t */
    public final String mo53333t(int i, Object... objArr) {
        return mo53256o().a(mo53252k(), i, objArr);
    }
}
