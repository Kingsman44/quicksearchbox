package com.google.android.apps.gsa.staticplugins.p7650cg.p7652b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90926bw;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.sidekick.main.notifications.C91541o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1646ay.C19599a;
import com.google.android.libraries.p1646ay.C19600b;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7867mx;
import com.google.p375ai.p378b.C7869mz;
import com.google.p375ai.p378b.C7871na;
import com.google.p375ai.p378b.C7874nd;
import com.google.p375ai.p378b.C8150xj;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.cg.b.v */
/* compiled from: PG */
public final class C97620v extends C19600b implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a */
    public static final C59071e f272655a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cg.b.v");

    /* renamed from: b */
    public final C89291a f272656b;

    /* renamed from: c */
    public final C90929bz f272657c;

    /* renamed from: d */
    public C7871na f272658d;

    /* renamed from: e */
    public TextView f272659e;

    /* renamed from: f */
    public TextView f272660f;

    /* renamed from: g */
    public final C90926bw f272661g = new C90926bw(C118826c.f331422a);

    /* renamed from: h */
    private final C91541o f272662h;

    /* renamed from: i */
    private C7718hj f272663i;

    /* renamed from: j */
    private boolean f272664j;

    /* renamed from: com.google.android.apps.gsa.staticplugins.cg.b.v$a */
    /* compiled from: PG */
    public interface C97621a {
        /* renamed from: sl */
        void mo90779sl();
    }

    public C97620v(C91541o oVar, C89291a aVar, C90929bz bzVar) {
        this.f272662h = oVar;
        this.f272656b = aVar;
        this.f272657c = bzVar;
    }

    /* renamed from: p */
    private final void m161814p(Context context, TextView textView, C8150xj xjVar) {
        if (textView.getVisibility() != 0) {
            textView.setVisibility(0);
        }
        textView.setText(this.f272656b.mo83231a(context, xjVar));
    }

    /* renamed from: b */
    public final void mo24895b(Bundle bundle) {
        Button button;
        C74504a.m120462a(f.bf);
        if (this.f272656b == null) {
            ((C97621a) C47266f.m84076a(this.f54539k, C97621a.class)).mo90779sl();
        }
        this.f272664j = bundle == null;
        this.f54539k.setTheme(2132150867);
        mo24913v();
        this.f54539k.mo24861h(bundle);
        Intent b = this.f54539k.mo24853b();
        if (b != null) {
            if (!b.hasExtra("com.google.android.apps.gsa.staticplugins.nowwidget.notifications.NOTIFICATION_ENTRY")) {
                C59104x d = f272655a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "NotifFeedbackActy");
                ((C59052c) ((C59052c) d).mo56372aa(22449)).mo56389s("Extra %s is missing", "com.google.android.apps.gsa.staticplugins.nowwidget.notifications.NOTIFICATION_ENTRY");
                int i = C90755l.f253831a;
                this.f54539k.mo24855e();
            } else if (!b.hasExtra("com.google.android.apps.gsa.staticplugins.nowwidget.notifications.NOTIFICATION_ACTION")) {
                C59104x d2 = f272655a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "NotifFeedbackActy");
                ((C59052c) ((C59052c) d2).mo56372aa(22448)).mo56389s("Action %s is missing", "com.google.android.apps.gsa.staticplugins.nowwidget.notifications.NOTIFICATION_ACTION");
                int i2 = C90755l.f253831a;
                this.f54539k.mo24855e();
            } else {
                byte[] byteArrayExtra = b.getByteArrayExtra("com.google.android.apps.gsa.staticplugins.nowwidget.notifications.NOTIFICATION_ENTRY");
                if (byteArrayExtra != null) {
                    try {
                        this.f272663i = (C7718hj) C62942bv.parseFrom((C62942bv) C7718hj.f26927af, byteArrayExtra, C62921ba.m95368a());
                    } catch (C62974ct unused) {
                        this.f272663i = C7718hj.f26927af;
                    }
                }
                C7681g a = C7681g.m22802a(b.getIntExtra("com.google.android.apps.gsa.staticplugins.nowwidget.notifications.NOTIFICATION_ACTION", 0));
                C7874nd ndVar = this.f272663i.f26938J;
                if (ndVar == null) {
                    ndVar = C7874nd.f27577J;
                }
                C7871na naVar = ndVar.f27579A;
                if (naVar == null) {
                    naVar = C7871na.f27564j;
                }
                this.f272658d = naVar;
                if (naVar != null) {
                    C7874nd ndVar2 = this.f272663i.f26938J;
                    if (ndVar2 == null) {
                        ndVar2 = C7874nd.f27577J;
                    }
                    if ((ndVar2.f27589a & 67108864) != 0) {
                        int a2 = C7869mz.m22881a(naVar.f27574i);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        if (a2 == 2 || (a2 == 3 && (C7681g.NOTIFICATION_FEEDBACK_THUMBS_UP == a || C7681g.DISAMBIGUATION_QUESTION_HERE == a))) {
                            if (this.f272664j) {
                                mo90776h(a);
                            }
                            C7871na naVar2 = this.f272658d;
                            if ((naVar2.f27566a & 64) != 0) {
                                C89291a aVar = this.f272656b;
                                C19599a aVar2 = this.f54539k;
                                C8150xj xjVar = naVar2.f27573h;
                                if (xjVar == null) {
                                    xjVar = C8150xj.f28657d;
                                }
                                Toast.makeText(this.f54539k, aVar.mo83231a(aVar2, xjVar), 1).show();
                            }
                            this.f54539k.mo24855e();
                            return;
                        }
                        if ((a == C7681g.NOTIFICATION_FEEDBACK_THUMBS_DOWN || a == C7681g.DISAMBIGUATION_QUESTION_NOT_HERE) && this.f272664j) {
                            this.f272661g.mo85235a(new C97608j(this, a));
                        }
                        C19599a aVar3 = this.f54539k;
                        aVar3.setContentView(R.layout.notification_feedback);
                        if ((this.f272658d.f27566a & 1) != 0) {
                            TextView textView = (TextView) this.f54539k.mo24854d(R.id.notification_feedback_title);
                            C8150xj xjVar2 = this.f272658d.f27567b;
                            if (xjVar2 == null) {
                                xjVar2 = C8150xj.f28657d;
                            }
                            m161814p(aVar3, textView, xjVar2);
                        }
                        if ((this.f272658d.f27566a & 2) != 0) {
                            TextView textView2 = (TextView) this.f54539k.mo24854d(R.id.notification_feedback_question);
                            C8150xj xjVar3 = this.f272658d.f27568c;
                            if (xjVar3 == null) {
                                xjVar3 = C8150xj.f28657d;
                            }
                            m161814p(aVar3, textView2, xjVar3);
                        }
                        ((RadioGroup) this.f54539k.mo24854d(R.id.notification_feedback_rating_group)).setOnCheckedChangeListener(this);
                        for (int i3 = 0; i3 < this.f272658d.f27569d.size(); i3++) {
                            C7867mx mxVar = (C7867mx) this.f272658d.f27569d.get(i3);
                            if ((mxVar.f27552a & 2) != 0) {
                                if (i3 == 0) {
                                    button = (Button) this.f54539k.mo24854d(R.id.notification_feedback_rating_1);
                                } else if (i3 == 1) {
                                    button = (Button) this.f54539k.mo24854d(R.id.notification_feedback_rating_2);
                                } else if (i3 == 2) {
                                    button = (Button) this.f54539k.mo24854d(R.id.notification_feedback_rating_3);
                                } else if (i3 != 3) {
                                    C59104x d3 = f272655a.mo56226d();
                                    d3.mo56378ag(C58975e.f156826a, "NotifFeedbackActy");
                                    C59052c cVar = (C59052c) ((C59052c) d3).mo56372aa(22450);
                                    C7708h hVar = mxVar.f27554c;
                                    if (hVar == null) {
                                        hVar = C7708h.f26894n;
                                    }
                                    C7681g a3 = C7681g.m22802a(hVar.f26897b);
                                    if (a3 == null) {
                                        a3 = C7681g.INVALID;
                                    }
                                    cVar.mo56389s("FeedbackOption, Action.Type %s is unexpected", a3);
                                    int i4 = C90755l.f253831a;
                                } else {
                                    button = (Button) this.f54539k.mo24854d(R.id.notification_feedback_rating_4);
                                }
                                C8150xj xjVar4 = mxVar.f27553b;
                                if (xjVar4 == null) {
                                    xjVar4 = C8150xj.f28657d;
                                }
                                m161814p(aVar3, button, xjVar4);
                            } else {
                                C59104x d4 = f272655a.mo56226d();
                                d4.mo56378ag(C58975e.f156826a, "NotifFeedbackActy");
                                ((C59052c) ((C59052c) d4).mo56372aa(22451)).mo56386p("FeedbackOption needs an action");
                                int i5 = C90755l.f253831a;
                            }
                        }
                        if ((this.f272658d.f27566a & 8) != 0) {
                            TextView textView3 = (TextView) this.f54539k.mo24854d(R.id.notification_feedback_footer);
                            C8150xj xjVar5 = this.f272658d.f27570e;
                            if (xjVar5 == null) {
                                xjVar5 = C8150xj.f28657d;
                            }
                            m161814p(aVar3, textView3, xjVar5);
                        }
                        TextView textView4 = (TextView) this.f54539k.mo24854d(R.id.notification_feedback_cancel_button);
                        this.f272659e = textView4;
                        textView4.setOnClickListener(new C97609k(this));
                        C7871na naVar3 = this.f272658d;
                        if ((naVar3.f27566a & 32) != 0) {
                            TextView textView5 = this.f272659e;
                            C8150xj xjVar6 = naVar3.f27572g;
                            if (xjVar6 == null) {
                                xjVar6 = C8150xj.f28657d;
                            }
                            m161814p(aVar3, textView5, xjVar6);
                        }
                        TextView textView6 = (TextView) this.f54539k.mo24854d(R.id.notification_feedback_submit_button);
                        this.f272660f = textView6;
                        textView6.setOnClickListener(new C97610l(this));
                        C7871na naVar4 = this.f272658d;
                        if ((naVar4.f27566a & 16) != 0) {
                            TextView textView7 = this.f272660f;
                            C8150xj xjVar7 = naVar4.f27571f;
                            if (xjVar7 == null) {
                                xjVar7 = C8150xj.f28657d;
                            }
                            m161814p(aVar3, textView7, xjVar7);
                            return;
                        }
                        return;
                    }
                }
                C59104x d5 = f272655a.mo56226d();
                d5.mo56378ag(C58975e.f156826a, "NotifFeedbackActy");
                ((C59052c) ((C59052c) d5).mo56372aa(22447)).mo56386p("NotificationFeedback is missing");
                int i6 = C90755l.f253831a;
                this.f54539k.mo24855e();
            }
        }
    }

    /* renamed from: d */
    public final void mo24897d() {
        if (this.f272664j) {
            if (mo90777n()) {
                this.f272661g.mo85235a(new C97614p(this));
            } else {
                this.f272661g.mo85235a(new C97615q(this));
            }
        }
        this.f54539k.mo24866m();
    }

    /* renamed from: h */
    public final C60870cx mo90776h(C7681g gVar) {
        return this.f272662h.mo85922a(this.f272663i, gVar, (C7669fo) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0010  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo90777n() {
        /*
            r3 = this;
            com.google.ai.b.na r0 = r3.f272658d
            if (r0 == 0) goto L_0x0038
            com.google.protobuf.cq r0 = r0.f27569d
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0038
            java.lang.Object r1 = r0.next()
            com.google.ai.b.mx r1 = (com.google.p375ai.p378b.C7867mx) r1
            com.google.ai.b.h r1 = r1.f27554c
            if (r1 != 0) goto L_0x001c
            com.google.ai.b.h r1 = com.google.p375ai.p378b.C7708h.f26894n
        L_0x001c:
            int r1 = r1.f26897b
            com.google.ai.b.g r1 = com.google.p375ai.p378b.C7681g.m22802a(r1)
            if (r1 != 0) goto L_0x0026
            com.google.ai.b.g r1 = com.google.p375ai.p378b.C7681g.INVALID
        L_0x0026:
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.DISAMBIGUATION_QUESTION_ALTERNATE_LOCATION_1
            if (r1 == r2) goto L_0x0036
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.DISAMBIGUATION_QUESTION_ALTERNATE_LOCATION_2
            if (r1 == r2) goto L_0x0036
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.DISAMBIGUATION_QUESTION_PASSING_BY
            if (r1 == r2) goto L_0x0036
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.DISAMBIGUATION_QUESTION_NONE_OF_ABOVE
            if (r1 != r2) goto L_0x000a
        L_0x0036:
            r0 = 1
            return r0
        L_0x0038:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7650cg.p7652b.C97620v.mo90777n():boolean");
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        ((TextView) this.f54539k.mo24854d(R.id.notification_feedback_submit_button)).setEnabled(true);
        ((RadioGroup) this.f54539k.mo24854d(R.id.notification_feedback_rating_group)).setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
    }
}
