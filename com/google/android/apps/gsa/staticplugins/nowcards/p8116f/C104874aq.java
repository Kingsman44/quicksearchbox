package com.google.android.apps.gsa.staticplugins.nowcards.p8116f;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91885i;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91890n;
import com.google.android.apps.gsa.sidekick.shared.util.C91992k;
import com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.C105038s;
import com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.p8122a.C105014o;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.googlequicksearchbox.R;
import com.google.p375ai.p378b.C7536ax;
import com.google.p375ai.p378b.C7902oe;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.f.aq */
/* compiled from: PG */
public final class C104874aq {

    /* renamed from: a */
    public final Context f292256a;

    /* renamed from: b */
    public final C104859ab f292257b;

    /* renamed from: c */
    public final C105038s f292258c;

    /* renamed from: d */
    public final C91885i f292259d;

    /* renamed from: e */
    public final View f292260e;

    /* renamed from: f */
    public ViewGroup f292261f;

    /* renamed from: g */
    public C91890n f292262g;

    /* renamed from: h */
    public boolean f292263h;

    /* renamed from: i */
    public final C105014o f292264i;

    /* renamed from: j */
    private final C89291a f292265j;

    public C104874aq(Context context, C104859ab abVar, C105038s sVar, C105014o oVar, C89291a aVar, C91885i iVar) {
        this.f292256a = context;
        this.f292257b = abVar;
        this.f292258c = sVar;
        this.f292264i = oVar;
        this.f292265j = aVar;
        this.f292259d = iVar;
        this.f292260e = LayoutInflater.from(context).inflate(R.layout.inline_video, (ViewGroup) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C9141ad mo94385a(C7902oe oeVar) {
        Context context = this.f292256a;
        C89291a aVar = this.f292265j;
        C7536ax axVar = oeVar.f27775f;
        if (axVar == null) {
            axVar = C7536ax.f26084o;
        }
        return C91992k.m150979g(context, aVar, false, axVar);
    }
}
