package com.google.android.apps.gsa.staticplugins.actionsui;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.gsa.search.shared.actions.VisitableAbstractVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.core.NewVisitableAbstractVoiceAction;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88507a;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88512f;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.x */
/* compiled from: PG */
public class C93699x {

    /* renamed from: a */
    public static final C59071e f261500a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actionsui.x");

    /* renamed from: b */
    public final Context f261501b;

    /* renamed from: c */
    public final Resources f261502c;

    /* renamed from: d */
    public final C58833ax f261503d;

    /* renamed from: e */
    public final C90465g f261504e;

    /* renamed from: f */
    public final int f261505f;

    /* renamed from: g */
    public final C68214a f261506g;

    /* renamed from: h */
    public final C91142g f261507h;

    /* renamed from: i */
    public final C58833ax f261508i;

    /* renamed from: j */
    public final C91123v f261509j;

    public C93699x(Context context, C91123v vVar, C90465g gVar, int i, C68214a aVar, C91142g gVar2, C58833ax axVar, C58833ax axVar2) {
        this.f261501b = context;
        this.f261509j = vVar;
        this.f261502c = context.getResources();
        this.f261504e = gVar;
        this.f261505f = i;
        this.f261506g = aVar;
        this.f261507h = gVar2;
        this.f261508i = axVar;
        this.f261503d = axVar2;
    }

    /* renamed from: a */
    public C88507a mo88150a(VoiceAction voiceAction, C88512f fVar) {
        if (voiceAction instanceof VisitableAbstractVoiceAction) {
            return (C88507a) ((VisitableAbstractVoiceAction) voiceAction).mo81132L(new C93698w(this, fVar));
        }
        if (!(voiceAction instanceof NewVisitableAbstractVoiceAction)) {
            return null;
        }
        return (C88507a) ((NewVisitableAbstractVoiceAction) voiceAction).mo81146L(new C93698w(this, fVar));
    }
}
