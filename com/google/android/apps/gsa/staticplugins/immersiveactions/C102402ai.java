package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.animation.ObjectAnimator;
import android.animation.TimeAnimator;
import android.widget.ProgressBar;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.C87423k;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88507a;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88510d;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88512f;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88299wn;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88301wp;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88357yr;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88359yt;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88360yu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88362yw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88374zh;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88375zi;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88376zj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88388zv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88389zw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88390zx;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.AudioArgumentView;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93527ae;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93528af;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93529ag;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93530ah;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93531ai;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.ai */
/* compiled from: PG */
final class C102402ai implements C87682aj {

    /* renamed from: a */
    final /* synthetic */ C102403aj f285813a;

    public C102402ai(C102403aj ajVar) {
        this.f285813a = ajVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        int ordinal = a.ordinal();
        if (ordinal == 11) {
            ((C88512f) this.f285813a.f285816c.mo27525b()).mo82074A(false);
        } else if (ordinal == 12) {
            ((C88512f) this.f285813a.f285816c.mo27525b()).mo82074A(true);
        } else if (ordinal == 15) {
            C87423k kVar = ((C88359yt) serviceEventData.mo81918e(C88357yr.f238949a)).f238953b;
            if (kVar == null) {
                kVar = C87423k.f236084e;
            }
            C88507a aVar = this.f285813a.f285819f;
            if (aVar == null || !aVar.mo82060w() || !aVar.mo82059v(kVar)) {
                this.f285813a.f285815b.mo81937i(new C88489j(C87739bu.UNDOABLE_INTERACTION_NOT_HANDLED).mo82013a());
            }
        } else if (ordinal == 16) {
            C62940bt btVar = C88360yu.f238954a;
            C88246uo uoVar = serviceEventData.f236959a;
            C62940bt r0 = C62942bv.checkIsLite(btVar);
            uoVar.mo58887l(r0);
            if (uoVar.f169962ag.mo58857o(r0.f169971d)) {
                C88362yw ywVar = (C88362yw) serviceEventData.mo81918e(C88360yu.f238954a);
                if (((C88512f) this.f285813a.f285816c.mo27525b()).mo82083J() != ywVar.f238958b) {
                    ((C88512f) this.f285813a.f285816c.mo27525b()).mo82074A(ywVar.f238958b);
                    C88507a aVar2 = this.f285813a.f285819f;
                    if (aVar2 != null) {
                        aVar2.mo82057t();
                        return;
                    }
                    return;
                }
                return;
            }
            C59104x c = C102403aj.f285814a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ImmersiveActionsUiCB");
            ((C59052c) ((C59052c) c).mo56372aa(20774)).mo56386p("setSearchServiceMessengerClient. UPDATE_CONVERSATION_STATE event missing extension.");
        } else if (ordinal == 20) {
            C62940bt btVar2 = C88299wn.f238810a;
            C88246uo uoVar2 = serviceEventData.f236959a;
            C62940bt r02 = C62942bv.checkIsLite(btVar2);
            uoVar2.mo58887l(r02);
            if (uoVar2.f169962ag.mo58857o(r02.f169971d)) {
                C88301wp wpVar = (C88301wp) serviceEventData.mo81918e(C88299wn.f238810a);
                if (((C88512f) this.f285813a.f285816c.mo27525b()).mo82086M() != wpVar.f238814b || ((C88512f) this.f285813a.f285816c.mo27525b()).mo82087N() != wpVar.f238815c) {
                    ((C88512f) this.f285813a.f285816c.mo27525b()).mo82117y(wpVar.f238814b);
                    ((C88512f) this.f285813a.f285816c.mo27525b()).mo82118z(wpVar.f238815c);
                    C88507a aVar3 = this.f285813a.f285819f;
                    if (aVar3 != null) {
                        aVar3.mo82057t();
                        return;
                    }
                    return;
                }
                return;
            }
            C59104x c2 = C102403aj.f285814a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "ImmersiveActionsUiCB");
            ((C59052c) ((C59052c) c2).mo56372aa(20775)).mo56386p("setSearchServiceMessengerClient. SHOW_PROMPT event missing extension.");
        } else if (ordinal == 26) {
            ((C88512f) this.f285813a.f285816c.mo27525b()).mo82114v((ActionData) serviceEventData.mo81912b(ActionData.class));
        } else if (ordinal == 69) {
            C88375zi ziVar = (C88375zi) serviceEventData.mo81918e(C88376zj.f238984a);
            C88507a aVar4 = this.f285813a.f285819f;
            if (aVar4 != null) {
                for (C88510d dVar : aVar4.mo82043f()) {
                    if (dVar instanceof C93530ah) {
                        int a2 = C88374zh.m142798a(ziVar.f238981b);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        int i = a2 - 1;
                        if (i == 1) {
                            int i2 = ziVar.f238983d;
                            AudioArgumentView audioArgumentView = ((C93530ah) dVar).f261166a;
                            ProgressBar progressBar = audioArgumentView.f261004c;
                            audioArgumentView.f261006e = ObjectAnimator.ofInt(progressBar, "progress", new int[]{0, progressBar.getMax()});
                            audioArgumentView.f261006e.setDuration((long) i2);
                            audioArgumentView.f261006e.removeAllUpdateListeners();
                            audioArgumentView.f261006e.addUpdateListener(new C93527ae(audioArgumentView));
                            audioArgumentView.f261006e.addListener(new C93528af(audioArgumentView));
                            audioArgumentView.f261006e.start();
                            audioArgumentView.f261011v = 5;
                            audioArgumentView.mo87732f();
                        } else if (i == 2) {
                            AudioArgumentView audioArgumentView2 = ((C93530ah) dVar).f261166a;
                            ObjectAnimator objectAnimator = audioArgumentView2.f261006e;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                            }
                            int i3 = audioArgumentView2.f261011v;
                            if (i3 == 5 || i3 == 6) {
                                audioArgumentView2.f261011v = 4;
                                audioArgumentView2.mo87732f();
                            }
                        } else if (i == 3) {
                            AudioArgumentView audioArgumentView3 = ((C93530ah) dVar).f261166a;
                            ObjectAnimator objectAnimator2 = audioArgumentView3.f261006e;
                            if (objectAnimator2 != null) {
                                audioArgumentView3.f261010i = objectAnimator2.getCurrentPlayTime();
                                int progress = audioArgumentView3.f261004c.getProgress();
                                audioArgumentView3.f261006e.cancel();
                                audioArgumentView3.f261004c.setProgress(progress);
                                audioArgumentView3.f261003b.setText((String) audioArgumentView3.f261003b.getText());
                            }
                            audioArgumentView3.f261011v = 6;
                            audioArgumentView3.mo87732f();
                        } else if (i == 4) {
                            AudioArgumentView audioArgumentView4 = ((C93530ah) dVar).f261166a;
                            ObjectAnimator objectAnimator3 = audioArgumentView4.f261006e;
                            if (objectAnimator3 != null) {
                                objectAnimator3.start();
                                audioArgumentView4.f261006e.setCurrentPlayTime(audioArgumentView4.f261010i);
                            }
                            audioArgumentView4.f261011v = 5;
                            audioArgumentView4.mo87732f();
                        }
                    }
                }
            }
        } else if (ordinal == 70) {
            C88389zw zwVar = (C88389zw) serviceEventData.mo81918e(C88390zx.f239007a);
            C88507a aVar5 = this.f285813a.f285819f;
            if (aVar5 != null) {
                for (C88510d dVar2 : aVar5.mo82043f()) {
                    if (dVar2 instanceof C93531ai) {
                        int a3 = C88388zv.m142799a(zwVar.f239006b);
                        if (a3 == 0) {
                            a3 = 1;
                        }
                        int i4 = a3 - 1;
                        if (i4 == 1) {
                            AudioArgumentView audioArgumentView5 = ((C93531ai) dVar2).f261167a;
                            if (audioArgumentView5.f261452r) {
                                audioArgumentView5.mo87856b();
                                audioArgumentView5.f261003b.setText("00:00");
                                audioArgumentView5.f261007f = true;
                                if (audioArgumentView5.f261009h == null) {
                                    audioArgumentView5.f261009h = new TimeAnimator();
                                }
                                audioArgumentView5.f261009h.setTimeListener(new C93529ag(audioArgumentView5));
                                audioArgumentView5.f261009h.start();
                                audioArgumentView5.f261011v = 3;
                                audioArgumentView5.mo87732f();
                            }
                        } else if (i4 == 2) {
                            AudioArgumentView audioArgumentView6 = ((C93531ai) dVar2).f261167a;
                            if (audioArgumentView6.f261007f) {
                                audioArgumentView6.f261007f = false;
                                TimeAnimator timeAnimator = audioArgumentView6.f261009h;
                                if (timeAnimator != null) {
                                    timeAnimator.end();
                                }
                                audioArgumentView6.f261011v = 4;
                                audioArgumentView6.mo87856b();
                                audioArgumentView6.mo87732f();
                            }
                        } else if (i4 == 3) {
                            AudioArgumentView audioArgumentView7 = ((C93531ai) dVar2).f261167a;
                            if (audioArgumentView7.f261007f) {
                                audioArgumentView7.f261007f = false;
                                TimeAnimator timeAnimator2 = audioArgumentView7.f261009h;
                                if (timeAnimator2 != null) {
                                    timeAnimator2.end();
                                }
                                audioArgumentView7.f261011v = 2;
                                audioArgumentView7.f261003b.setText("00:00");
                                audioArgumentView7.mo87856b();
                                audioArgumentView7.mo87732f();
                            }
                        }
                    }
                }
            }
        }
    }
}
