package com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2593c;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.content.ComponentName;
import android.os.Build;
import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.AssistStateCompat;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.ArrayList;
import java.util.Set;
import p3186j$.util.Optional;
import p5462h.p5463a.C69531o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.c.d */
/* compiled from: PG */
public final class C33510d {

    /* renamed from: a */
    public static final C58974d f89661a = C58974d.m91136j();

    /* renamed from: b */
    public static final Set f89662b = C69531o.m100939p(new String[]{"com.google.android.apps.gsa.nga.engine.education.ui.GlowQuerySuggestionActivity", "com.google.android.apps.gsa.staticplugins.deeplink.activity.DeeplinkActivity"});

    /* renamed from: c */
    public static final Set f89663c = C69531o.m100939p(new String[]{"com.google.android.apps.gsa.staticplugins.opa.OpaActivity", "com.google.android.apps.gsa.nga.engine.ui.answer.AnswerUiActivity", "com.google.android.apps.search.assistant.surfaces.voice.ui.host.activity.defaultactivity.FragmentHostDefaultActivity", "com.google.android.apps.search.assistant.surfaces.voice.ui.host.activity.fullscreenactivity.FragmentHostFullScreenActivity", "com.google.android.apps.search.assistant.surfaces.voice.ui.host.activity.transientactivity.FragmentHostTransientActivity"});

    /* renamed from: d */
    private final C33509c f89664d;

    /* renamed from: e */
    private Integer f89665e;

    /* renamed from: f */
    private ArrayList f89666f = new ArrayList();

    /* renamed from: g */
    private C33507a f89667g;

    /* renamed from: h */
    private int f89668h = 1;

    public C33510d(C33509c cVar) {
        this.f89664d = cVar;
    }

    /* renamed from: d */
    private final void m62102d(C33507a aVar) {
        C33509c cVar = this.f89664d;
        Bundle bundle = aVar.f89654a;
        AssistStructure assistStructure = aVar.f89655b;
        AssistContent assistContent = aVar.f89656c;
        Optional ofNullable = Optional.ofNullable(aVar.f89657d);
        C69664n.m101060f(ofNullable, "ofNullable(result.activityId)");
        Optional ofNullable2 = Optional.ofNullable(aVar.f89658e);
        C69664n.m101060f(ofNullable2, "ofNullable(result.mappedActivityId)");
        cVar.mo38938a(bundle, assistStructure, assistContent, ofNullable, ofNullable2);
        this.f89666f = new ArrayList();
        this.f89665e = null;
        this.f89667g = null;
    }

    /* renamed from: a */
    public final void mo38939a(AssistStateCompat assistStateCompat, VoiceInteractionSession.ActivityId activityId) {
        C69664n.m101061g(assistStateCompat, "assistState");
        mo38940b(new C33507a(assistStateCompat.f89669a, assistStateCompat.f89670b, assistStateCompat.f89671c, activityId, assistStateCompat.f89674f, assistStateCompat.f89672d, assistStateCompat.f89673e));
    }

    /* renamed from: b */
    public final void mo38940b(C33507a aVar) {
        Integer num;
        C33507a aVar2;
        if (Build.VERSION.SDK_INT > 30 && aVar.f89654a == null && aVar.f89655b == null && aVar.f89656c == null) {
            ((C58970a) f89661a.mo56226d()).mo56386p("Skip updating assistState because all data is null.");
        } else if (aVar.f89659f != -1 && ((num = aVar.f89660g) == null || num.intValue() != 0)) {
            Integer num2 = aVar.f89660g;
            if (num2 != null) {
                int intValue = num2.intValue();
                int i = aVar.f89659f;
                if (intValue < i + 1) {
                    ((C58970a) f89661a.mo56226d()).mo56393w("count needs to be greater than index, ignoring, index=%s, count=%s.", i, aVar.f89660g.intValue());
                    return;
                }
            }
            if (this.f89668h != 2) {
                ((C58970a) f89661a.mo56226d()).mo56386p("not collecting data, ignoring");
                return;
            }
            Integer num3 = this.f89665e;
            if (num3 != null) {
                Integer num4 = aVar.f89660g;
                if (num4 != null && !C69664n.m101066l(num4, num3)) {
                    ((C58970a) f89661a.mo56226d()).mo56386p("The states size and state count not matching! This should never happen.");
                    return;
                } else if (aVar.f89659f >= num3.intValue()) {
                    ((C58970a) f89661a.mo56226d()).mo56387q("State index %s out of bounds! This should never happen.", aVar.f89659f);
                    return;
                }
            } else {
                this.f89665e = aVar.f89660g;
            }
            Integer num5 = aVar.f89660g;
            int intValue2 = num5 != null ? num5.intValue() : aVar.f89659f + 1;
            C33507a aVar3 = null;
            if (this.f89666f.size() < intValue2) {
                this.f89666f.ensureCapacity(intValue2);
                while (this.f89666f.size() < intValue2) {
                    this.f89666f.add((Object) null);
                }
            }
            this.f89666f.set(aVar.f89659f, aVar);
            if (this.f89666f.size() > 0 && (aVar2 = (C33507a) this.f89666f.get(0)) != null) {
                ComponentName a = C33511e.m62106a(aVar2.f89655b, aVar2.f89656c);
                if (a != null) {
                    if (!C33508b.m62100a(a)) {
                        a.flattenToString();
                    } else {
                        Integer num6 = this.f89665e;
                        if (num6 == null || num6.intValue() >= 2) {
                            if (this.f89666f.size() >= 2 && (aVar2 = (C33507a) this.f89666f.get(1)) != null) {
                                ComponentName a2 = C33511e.m62106a(aVar2.f89655b, aVar2.f89656c);
                                if (a2 != null) {
                                    a2.flattenToString();
                                }
                            }
                        }
                    }
                }
                aVar3 = aVar2;
            }
            if (aVar3 != null) {
                m62102d(aVar3);
                this.f89668h = 1;
            }
        } else if (this.f89668h == 1) {
            this.f89667g = aVar;
            this.f89668h = 3;
        } else {
            m62102d(aVar);
            this.f89668h = 1;
        }
    }

    /* renamed from: c */
    public final void mo38941c() {
        C33507a aVar = this.f89667g;
        if (this.f89668h != 3 || aVar == null) {
            this.f89668h = 2;
            this.f89667g = null;
            this.f89666f = new ArrayList();
            this.f89665e = null;
            return;
        }
        m62102d(aVar);
        this.f89668h = 1;
    }
}
