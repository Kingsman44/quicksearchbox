package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import android.content.Intent;
import android.content.pm.ShortcutInfo;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113321r;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113323t;
import com.google.android.libraries.searchbox.shared.suggestion.C41679e;
import com.google.android.libraries.searchbox.shared.suggestion.C41693s;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4552o.p4553a.C59527cx;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.OptionalInt;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.bb */
/* compiled from: PG */
final class C113277bb extends C113416f {

    /* renamed from: M */
    private volatile transient Optional f313707M;

    /* renamed from: N */
    private volatile transient C58485gu f313708N;

    /* renamed from: O */
    private volatile transient Optional f313709O;

    /* renamed from: P */
    private volatile transient String f313710P;

    /* renamed from: Q */
    private volatile transient C60870cx f313711Q;

    /* renamed from: R */
    private volatile transient int f313712R;

    /* renamed from: S */
    private volatile transient boolean f313713S;

    /* renamed from: T */
    private volatile transient String f313714T;

    public C113277bb(String str, int i, C48580an anVar, int i2, int i3, double d, double d2, C48672ag agVar, Optional optional, C41679e eVar, Optional optional2, Optional optional3, OptionalInt optionalInt, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8, Optional optional9, Optional optional10, Optional optional11, Optional optional12, C58495hd hdVar, Optional optional13, Optional optional14, Optional optional15, Optional optional16, Optional optional17, C59527cx cxVar, C113397eh ehVar, Optional optional18, Optional optional19, C58485gu guVar, Optional optional20, Optional optional21, float f, Optional optional22) {
        super(str, i, anVar, i2, i3, d, d2, agVar, optional, eVar, optional2, optional3, optionalInt, optional4, optional5, optional6, optional7, optional8, optional9, optional10, optional11, optional12, hdVar, optional13, optional14, optional15, optional16, optional17, cxVar, ehVar, optional18, optional19, guVar, optional20, optional21, f, optional22);
    }

    /* renamed from: M */
    public final C58485gu mo100054M() {
        C58485gu guVar;
        String str;
        if (this.f313708N == null) {
            synchronized (this) {
                if (this.f313708N == null) {
                    if (!this.f314074u.isPresent() || !((C113502n) this.f314074u.get()).mo100047j().isPresent()) {
                        if (this.f314069p.isPresent()) {
                            if (((C113284bi) this.f314069p.get()).mo99960b().isPresent() && (str = ((Intent) ((C113284bi) this.f314069p.get()).mo99960b().get()).getPackage()) != null) {
                                guVar = C58485gu.m89846n(str);
                            } else if (((C113284bi) this.f314069p.get()).mo99962d().isPresent()) {
                                guVar = C58485gu.m89846n(((ShortcutInfo) ((C113284bi) this.f314069p.get()).mo99962d().get()).getPackage());
                            }
                        }
                        if (this.f314073t.isPresent() && ((C113496i) this.f314073t.get()).mo99952b().isPresent()) {
                            guVar = C58485gu.m89846n((String) ((C113496i) this.f314073t.get()).mo99952b().get());
                        } else if (this.f314077x.isPresent()) {
                            guVar = C58485gu.m89846n(((C113323t) this.f314077x.get()).mo100105g());
                        } else if (this.f314079z.isPresent()) {
                            guVar = C58485gu.m89846n(((C113426fg) this.f314079z.get()).mo100078c());
                        } else {
                            if (this.f314064k.isPresent()) {
                                switch (this.f314058e) {
                                    case 10030:
                                        guVar = C58485gu.m89846n("com.google.android.music");
                                        break;
                                    case 10031:
                                        guVar = C58485gu.m89846n("com.spotify.music");
                                        break;
                                    case 10032:
                                        guVar = C58485gu.m89846n("com.google.android.apps.youtube.music");
                                        break;
                                }
                            }
                            if (this.f314078y.isPresent()) {
                                guVar = (C58485gu) Collection.EL.stream((List) this.f314078y.get()).map(C113411ev.f314039a).collect(C58370cn.f155946a);
                            } else {
                                if (!this.f314068o.isPresent()) {
                                    if (this.f314061h != C48672ag.COMPLETE_SERVER) {
                                        C41693s sVar = this.f314063j.f109009c;
                                        if (sVar == null) {
                                            sVar = C41693s.f109053h;
                                        }
                                        if ((sVar.f109055a & 8) != 0) {
                                            C41693s sVar2 = this.f314063j.f109009c;
                                            if (sVar2 == null) {
                                                sVar2 = C41693s.f109053h;
                                            }
                                            guVar = C58485gu.m89846n(sVar2.f109059e);
                                        } else {
                                            guVar = C58485gu.m89845m();
                                        }
                                    }
                                }
                                guVar = C58485gu.m89846n("com.google.android.googlequicksearchbox");
                            }
                        }
                    } else {
                        guVar = C58485gu.m89846n((String) ((C113502n) this.f314074u.get()).mo100047j().get());
                    }
                    this.f313708N = guVar;
                    if (this.f313708N == null) {
                        throw new NullPointerException("getFulfillmentPackages() cannot return null");
                    }
                }
            }
        }
        return this.f313708N;
    }

    /* renamed from: N */
    public final C60870cx mo100055N() {
        C60870cx cxVar;
        if (this.f313711Q == null) {
            synchronized (this) {
                if (this.f313711Q == null) {
                    if (this.f314074u.isPresent()) {
                        cxVar = C60856cj.m92900i((String) ((C113502n) this.f314074u.get()).mo100043g().orElse(BuildConfig.FLAVOR));
                    } else if (this.f314056c.equals(C48580an.APP_SHORTCUTS) && this.f314069p.isPresent()) {
                        cxVar = (C60870cx) ((C113284bi) this.f314069p.get()).mo99959a().map(C113410eu.f314038a).orElse(C60856cj.m92900i(BuildConfig.FLAVOR));
                    } else if (this.f314056c.equals(C48580an.ICON_SHORTCUT)) {
                        cxVar = C60856cj.m92900i(this.f314054a);
                    } else {
                        cxVar = C60856cj.m92900i(BuildConfig.FLAVOR);
                    }
                    this.f313711Q = cxVar;
                    if (this.f313711Q == null) {
                        throw new NullPointerException("getAppName() cannot return null");
                    }
                }
            }
        }
        return this.f313711Q;
    }

    /* renamed from: O */
    public final Optional mo100056O() {
        if (this.f313707M == null) {
            synchronized (this) {
                if (this.f313707M == null) {
                    this.f313707M = Collection.EL.stream(mo100054M()).findFirst();
                    if (this.f313707M == null) {
                        throw new NullPointerException("getFulfillmentPackage() cannot return null");
                    }
                }
            }
        }
        return this.f313707M;
    }

    /* renamed from: P */
    public final Optional mo100057P() {
        if (this.f313709O == null) {
            synchronized (this) {
                if (this.f313709O == null) {
                    this.f313709O = this.f314067n.flatMap(C113413ex.f314041a);
                    if (this.f313709O == null) {
                        throw new NullPointerException("getInterpretation() cannot return null");
                    }
                }
            }
        }
        return this.f313709O;
    }

    /* renamed from: Q */
    public final String mo100058Q() {
        int i;
        if (this.f313710P == null) {
            synchronized (this) {
                if (this.f313710P == null) {
                    StringBuilder sb = new StringBuilder(this.f314054a);
                    sb.append(",");
                    sb.append(this.f314055b);
                    sb.append(",");
                    sb.append(this.f314057d);
                    sb.append(",");
                    sb.append(this.f314058e);
                    sb.append(",");
                    if (this.f314062i.isPresent()) {
                        i = ((C48672ag) this.f314062i.get()).f125915O;
                    } else {
                        i = this.f314061h.f125915O;
                    }
                    sb.append(i);
                    sb.append(",");
                    if (this.f314064k.isPresent()) {
                        sb.append(((C113294bs) this.f314064k.get()).mo99970a().f932a);
                    }
                    sb.append(",");
                    List list = (List) this.f314078y.orElse(C58485gu.m89845m());
                    if (!list.isEmpty()) {
                        sb.append(((C113321r) list.get(0)).f313838e);
                    }
                    this.f313710P = sb.toString();
                    if (this.f313710P == null) {
                        throw new NullPointerException("getFulfillmentId() cannot return null");
                    }
                }
            }
        }
        return this.f313710P;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C113277bb) || hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof C113415ez)) {
                return false;
            }
            C113415ez ezVar = (C113415ez) obj;
            if (!this.f314054a.equals(ezVar.mo100199L()) || this.f314055b != ezVar.mo100206f() || !this.f314056c.equals(ezVar.mo100210j()) || this.f314057d != ezVar.mo100205e() || this.f314058e != ezVar.mo100204d() || Double.doubleToLongBits(this.f314059f) != Double.doubleToLongBits(ezVar.mo100201a()) || Double.doubleToLongBits(this.f314060g) != Double.doubleToLongBits(ezVar.mo100202b()) || !this.f314061h.equals(ezVar.mo100211k()) || !this.f314062i.equals(ezVar.mo100222v()) || !this.f314063j.equals(ezVar.mo100209i()) || !this.f314064k.equals(ezVar.mo100226z()) || !this.f314065l.equals(ezVar.mo100191D()) || !this.f314066m.equals(ezVar.mo100198K()) || !this.f314067n.equals(ezVar.mo100195H()) || !this.f314068o.equals(ezVar.mo100189B()) || !this.f314069p.equals(ezVar.mo100224x()) || !this.f314070q.equals(ezVar.mo100196I()) || !this.f314071r.equals(ezVar.mo100223w()) || !this.f314072s.equals(ezVar.mo100190C()) || !this.f314073t.equals(ezVar.mo100216p()) || !this.f314074u.equals(ezVar.mo100218r()) || !this.f314075v.equals(ezVar.mo100193F()) || !this.f314076w.equals(ezVar.mo100213m()) || !this.f314077x.equals(ezVar.mo100215o()) || !this.f314078y.equals(ezVar.mo100220t()) || !this.f314079z.equals(ezVar.mo100197J()) || !this.f314043A.equals(ezVar.mo100194G()) || !this.f314044B.equals(ezVar.mo100217q()) || !this.f314045C.equals(ezVar.mo100214n()) || !this.f314046D.equals(ezVar.mo100207g()) || !this.f314047E.equals(ezVar.mo100225y()) || !this.f314048F.equals(ezVar.mo100188A()) || !C58597ky.m90218i(this.f314049G, ezVar.mo100212l()) || !this.f314050H.equals(ezVar.mo100192E()) || !this.f314051I.equals(ezVar.mo100219s()) || Float.floatToIntBits(this.f314052J) != Float.floatToIntBits(ezVar.mo100203c()) || !this.f314053K.equals(ezVar.mo100221u())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f313713S) {
            synchronized (this) {
                if (!this.f313713S) {
                    this.f313712R = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.f314054a.hashCode() ^ 1000003) * 1000003) ^ this.f314055b) * 1000003) ^ this.f314056c.hashCode()) * 1000003) ^ this.f314057d) * 1000003) ^ this.f314058e) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f314059f) >>> 32) ^ Double.doubleToLongBits(this.f314059f)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f314060g) >>> 32) ^ Double.doubleToLongBits(this.f314060g)))) * 1000003) ^ this.f314061h.hashCode()) * 1000003) ^ this.f314062i.hashCode()) * 1000003) ^ this.f314063j.hashCode()) * 1000003) ^ this.f314064k.hashCode()) * 1000003) ^ this.f314065l.hashCode()) * 1000003) ^ this.f314066m.hashCode()) * 1000003) ^ this.f314067n.hashCode()) * 1000003) ^ this.f314068o.hashCode()) * 1000003) ^ this.f314069p.hashCode()) * 1000003) ^ this.f314070q.hashCode()) * 1000003) ^ this.f314071r.hashCode()) * 1000003) ^ this.f314072s.hashCode()) * 1000003) ^ this.f314073t.hashCode()) * 1000003) ^ this.f314074u.hashCode()) * 1000003) ^ this.f314075v.hashCode()) * 1000003) ^ C58758qx.m90643a(this.f314076w.entrySet())) * 1000003) ^ this.f314077x.hashCode()) * 1000003) ^ this.f314078y.hashCode()) * 1000003) ^ this.f314079z.hashCode()) * 1000003) ^ this.f314043A.hashCode()) * 1000003) ^ this.f314044B.hashCode()) * 1000003) ^ this.f314045C.hashCode()) * 1000003) ^ this.f314046D.hashCode()) * 1000003) ^ this.f314047E.hashCode()) * 1000003) ^ this.f314048F.hashCode()) * 1000003) ^ this.f314049G.hashCode()) * 1000003) ^ this.f314050H.hashCode()) * 1000003) ^ this.f314051I.hashCode()) * 1000003) ^ Float.floatToIntBits(this.f314052J)) * 1000003) ^ this.f314053K.hashCode();
                    this.f313713S = true;
                }
            }
        }
        return this.f313712R;
    }

    public final String toString() {
        if (this.f313714T == null) {
            synchronized (this) {
                if (this.f313714T == null) {
                    String str = this.f314054a;
                    int i = this.f314055b;
                    String num = Integer.toString(this.f314056c.getNumber());
                    int i2 = this.f314057d;
                    int i3 = this.f314058e;
                    double d = this.f314059f;
                    double d2 = this.f314060g;
                    String num2 = Integer.toString(this.f314061h.f125915O);
                    String obj = this.f314062i.toString();
                    String obj2 = this.f314063j.toString();
                    String obj3 = this.f314064k.toString();
                    String obj4 = this.f314065l.toString();
                    String obj5 = this.f314066m.toString();
                    String obj6 = this.f314067n.toString();
                    String obj7 = this.f314068o.toString();
                    String obj8 = this.f314069p.toString();
                    String obj9 = this.f314070q.toString();
                    String obj10 = this.f314071r.toString();
                    String obj11 = this.f314072s.toString();
                    String obj12 = this.f314073t.toString();
                    String obj13 = this.f314074u.toString();
                    String obj14 = this.f314075v.toString();
                    String obj15 = this.f314076w.toString();
                    String obj16 = this.f314077x.toString();
                    String obj17 = this.f314078y.toString();
                    String obj18 = this.f314079z.toString();
                    String obj19 = this.f314043A.toString();
                    String obj20 = this.f314044B.toString();
                    String obj21 = this.f314045C.toString();
                    String obj22 = this.f314046D.toString();
                    String obj23 = this.f314047E.toString();
                    String obj24 = this.f314048F.toString();
                    String obj25 = this.f314049G.toString();
                    String obj26 = this.f314050H.toString();
                    String obj27 = this.f314051I.toString();
                    float f = this.f314052J;
                    String obj28 = this.f314053K.toString();
                    this.f313714T = "TapasSuggestionWrapper{displayText=" + str + ", type=" + i + ", suggestionType=" + num + ", subtype=" + i2 + ", group=" + i3 + ", currentScore=" + d + ", sourceScore=" + d2 + ", sourceType=" + num2 + ", effectiveSourceType=" + obj + ", clientParameters=" + obj2 + ", mediaSuggestionParams=" + obj3 + ", suggestResult=" + obj4 + ", positionInCortexLog=" + obj5 + ", tapasSuggestion=" + obj6 + ", showWeatherArgs=" + obj7 + ", iconShortcutSuggestionParams=" + obj8 + ", textItemRenderingParams=" + obj9 + ", htmlDisplayText=" + obj10 + ", styledTextDisplayText=" + obj11 + ", androidIntentFulfillmentParams=" + obj12 + ", appActionSuggestionParams=" + obj13 + ", tapasHomeAutomationSuggestionParams=" + obj14 + ", similarityKeysByType=" + obj15 + ", activeMessageSuggestionParams=" + obj16 + ", contactInfos=" + obj17 + ", videoSuggestionParams=" + obj18 + ", tapasProductivityParams=" + obj19 + ", answerParams=" + obj20 + ", clientLog=" + obj21 + ", features=" + obj22 + ", logsRedactionType=" + obj23 + ", queryFulfillmentMethod=" + obj24 + ", primaryIconCandidates=" + obj25 + ", tapasEntityInfo=" + obj26 + ", calculationResult=" + obj27 + ", cortexScoreAdjustment=" + f + ", correctionParams=" + obj28 + "}";
                    if (this.f313714T == null) {
                        throw new NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.f313714T;
    }
}
