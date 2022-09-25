package com.google.android.apps.gsa.staticplugins.nowcards.p8117g;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.now.shared.p6421ui.C83413b;
import com.google.android.apps.gsa.now.shared.p6421ui.RecyclerViewStub;
import com.google.android.apps.gsa.now.shared.p6421ui.WebImageView;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91885i;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91890n;
import com.google.android.apps.gsa.sidekick.shared.p7256ui.ModularCard;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104350n;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104435al;
import com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.C105038s;
import com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.p8122a.C105013n;
import com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.p8122a.C105014o;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105070g;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.MetadataLineView;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9188bx;
import com.google.android.apps.p489g.p494d.C9201cj;
import com.google.android.apps.p489g.p494d.C9204cm;
import com.google.android.apps.p489g.p494d.C9206co;
import com.google.android.apps.p489g.p494d.C9211ct;
import com.google.android.apps.p489g.p494d.C9212cu;
import com.google.android.apps.p489g.p494d.C9215cx;
import com.google.android.apps.p489g.p494d.C9273q;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.apps.p489g.p494d.C9281y;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7718hj;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.g.az */
/* compiled from: PG */
public final class C104928az extends C104348l {

    /* renamed from: E */
    private static final C59071e f292361E = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.g.az");

    /* renamed from: y */
    public static final C9277u[] f292362y = {C9277u.CLOSET_NAVIGATION_ROW, C9277u.HERO_IMAGE_CENTER, C9277u.HERO_IMAGE_RIGHT, C9277u.METADATA_CARD_ASSISTANT_HQ_EMPTY_CLUSTER, C9277u.METADATA_CARD_ASSISTANT_HQ_IMAGE_RIGHT, C9277u.METADATA_CARD_ASSISTANT_HQ_PROMO_BANNER, C9277u.METADATA_CARD_EMBEDDED_EMAIL, C9277u.METADATA_CARD_HEADER, C9277u.METADATA_CARD_IMAGE_RIGHT, C9277u.METADATA_CARD_IMAGE_LEFT, C9277u.METADATA_CARD_LARGE_IMAGE_SMALL_RIGHT, C9277u.METADATA_CARD_LIST_ROW, C9277u.METADATA_CARD_PORTRAIT_SMALL_RIGHT, C9277u.METADATA_CARD_SMALL_ARTICLE, C9277u.METADATA_CARD_SMALL_CENTERED_ICON, C9277u.METADATA_CARD_SMALL_RIGHT, C9277u.METADATA_CARD_SCREENIE, C9277u.METADATA_CARD_SCREENIE_ARTICLE, C9277u.METADATA_CARD_SCREENIE_MOVIE, C9277u.METADATA_CARD_SCREENIE_LIST_HEADER, C9277u.METADATA_CARD_SUGGESTION_CHIPS, C9277u.METADATA_CARD_SUGGESTION_CHIPS_IMAGE_RIGHT, C9277u.METADATA_CARD_SUGGESTION_CHIPS_LIST_ROW, C9277u.METADATA_CARD_TUTORIAL, C9277u.RELATED_HEADER, C9277u.TRAY_CRITIC, C9277u.TRAY_GENERIC_LARGE_SPACE, C9277u.TRAY_GENERIC_SMALL_SPACE, C9277u.TRAY_SPORTS_STANDINGS, C9277u.TRAY_IMAGE_FULL, C9277u.TRAY_SEARCH_CHIP, C9277u.TRAY_SEARCH_CHIP_WRAP, C9277u.VOICE_OF_FEED};

    /* renamed from: A */
    public MetadataLineView f292363A;

    /* renamed from: B */
    public MetadataLineView f292364B;

    /* renamed from: C */
    public MetadataLineView f292365C;

    /* renamed from: D */
    public MetadataLineView f292366D;

    /* renamed from: F */
    private C104957ca f292367F;

    /* renamed from: G */
    private C104943bn f292368G;

    /* renamed from: H */
    private final C105070g f292369H;

    /* renamed from: I */
    private final C91885i f292370I;

    /* renamed from: J */
    private final C105038s f292371J;

    /* renamed from: K */
    private View f292372K;

    /* renamed from: L */
    private LinearLayout f292373L;

    /* renamed from: M */
    private RecyclerViewStub f292374M;

    /* renamed from: N */
    private RecyclerViewStub f292375N;

    /* renamed from: O */
    private WebImageView f292376O;

    /* renamed from: P */
    private View f292377P;

    /* renamed from: Q */
    private ViewGroup f292378Q;

    /* renamed from: R */
    private C91890n f292379R;

    /* renamed from: S */
    private boolean f292380S;

    /* renamed from: T */
    private final List f292381T = new ArrayList();

    /* renamed from: U */
    private int f292382U;

    /* renamed from: V */
    private boolean f292383V;

    /* renamed from: W */
    private final C105014o f292384W;

    /* renamed from: z */
    public MetadataLineView f292385z;

    public C104928az(Context context, C104350n nVar, C105070g gVar, C91885i iVar, C105038s sVar, C105014o oVar) {
        super(context, nVar);
        this.f292369H = gVar;
        this.f292370I = iVar;
        this.f292371J = sVar;
        this.f292384W = oVar;
    }

    /* renamed from: N */
    private final int m173941N() {
        MetadataLineView metadataLineView = this.f292385z;
        if (metadataLineView == null || metadataLineView.getChildCount() <= 0) {
            return this.f290307b.getResources().getColor(R.color.text_decoration_fallback);
        }
        return ((TextView) this.f292385z.getChildAt(0)).getCurrentTextColor();
    }

    /* renamed from: O */
    private final void m173942O() {
        if (this.f292380S) {
            ViewGroup viewGroup = this.f292378Q;
            if (viewGroup != null) {
                this.f292370I.mo86424d(viewGroup);
                this.f292378Q = null;
            }
            C91890n nVar = this.f292379R;
            if (nVar != null) {
                nVar.mo86440a();
                this.f292379R = null;
            }
            this.f292380S = false;
        }
    }

    /* renamed from: L */
    public final void mo94397L(int i, int i2) {
        RecyclerViewStub recyclerViewStub = this.f292374M;
        if (recyclerViewStub != null) {
            ViewGroup.LayoutParams layoutParams = recyclerViewStub.getLayoutParams();
            if (i != layoutParams.width || i2 != layoutParams.height) {
                layoutParams.width = i;
                layoutParams.height = i2;
                recyclerViewStub.setLayoutParams(layoutParams);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final void mo94398M() {
        RecyclerViewStub recyclerViewStub;
        if (!this.f292380S && (recyclerViewStub = this.f292374M) != null) {
            ViewGroup viewGroup = (ViewGroup) recyclerViewStub.findViewWithTag(this.f290307b.getString(R.string.video_rounded_corner_frame));
            this.f292378Q = viewGroup;
            if (viewGroup != null) {
                C9278v vVar = this.f290310e;
                C9141ad adVar = vVar.f32169C;
                if (adVar == null) {
                    adVar = C9141ad.f31521K;
                }
                C9215cx cxVar = adVar.f31555u;
                if (cxVar == null) {
                    cxVar = C9215cx.f31837o;
                }
                boolean a = this.f292371J.mo94484a(cxVar);
                C91890n a2 = this.f292384W.mo94472a(recyclerViewStub, false);
                C9188bx bxVar = vVar.f32210q;
                if (bxVar == null) {
                    bxVar = C9188bx.f31714x;
                }
                C9201cj cjVar = bxVar.f31721f;
                if (cjVar == null) {
                    cjVar = C9201cj.f31773u;
                }
                C105013n nVar = (C105013n) a2;
                nVar.f292600f = cjVar.f31794t;
                nVar.mo94471i();
                a2.mo86447h(2);
                a2.mo86441b(3, C83413b.m132808a(this.f290307b));
                if (a) {
                    if ((cxVar.f31839a & 8) != 0) {
                        C9206co coVar = cxVar.f31842d;
                        if (coVar == null) {
                            coVar = C9206co.f31803d;
                        }
                        a2.mo86442c(coVar.f31807c);
                    } else if (cxVar.f31840b == 12) {
                        a2.mo86442c(((C9206co) cxVar.f31841c).f31807c);
                    }
                }
                this.f292379R = a2;
                if (!a) {
                    if (!this.f292371J.mo94485b(cxVar)) {
                        a2.mo86445f();
                    }
                } else if (!nVar.f292602h) {
                    C9188bx bxVar2 = vVar.f32210q;
                    if (bxVar2 == null) {
                        bxVar2 = C9188bx.f31714x;
                    }
                    if ((bxVar2.f31716a & 2) != 0) {
                        C9141ad adVar2 = vVar.f32169C;
                        if (adVar2 == null) {
                            adVar2 = C9141ad.f31521K;
                        }
                        C9215cx cxVar2 = adVar2.f31555u;
                        if (cxVar2 == null) {
                            cxVar2 = C9215cx.f31837o;
                        }
                        if (cxVar2.f31840b == 2) {
                            C9204cm cmVar = (C9204cm) cxVar.toBuilder();
                            C9211ct ctVar = (C9211ct) (cxVar.f31840b == 2 ? (C9212cu) cxVar.f31841c : C9212cu.f31820l).toBuilder();
                            C9188bx bxVar3 = vVar.f32210q;
                            if (bxVar3 == null) {
                                bxVar3 = C9188bx.f31714x;
                            }
                            C9201cj cjVar2 = bxVar3.f31721f;
                            if (cjVar2 == null) {
                                cjVar2 = C9201cj.f31773u;
                            }
                            String str = cjVar2.f31776b;
                            ctVar.copyOnWrite();
                            C9212cu cuVar = (C9212cu) ctVar.instance;
                            str.getClass();
                            cuVar.f31822a |= 16;
                            cuVar.f31828g = str;
                            cmVar.copyOnWrite();
                            C9215cx cxVar3 = (C9215cx) cmVar.instance;
                            C9212cu cuVar2 = (C9212cu) ctVar.build();
                            cuVar2.getClass();
                            cxVar3.f31841c = cuVar2;
                            cxVar3.f31840b = 2;
                            C9215cx cxVar4 = (C9215cx) cmVar.build();
                            C9273q qVar = (C9273q) vVar.toBuilder();
                            C9141ad adVar3 = vVar.f32169C;
                            if (adVar3 == null) {
                                adVar3 = C9141ad.f31521K;
                            }
                            C9281y yVar = (C9281y) adVar3.toBuilder();
                            yVar.copyOnWrite();
                            C9141ad adVar4 = (C9141ad) yVar.instance;
                            cxVar4.getClass();
                            adVar4.f31555u = cxVar4;
                            adVar4.f31535a |= 1048576;
                            qVar.copyOnWrite();
                            C9278v vVar2 = (C9278v) qVar.instance;
                            C9141ad adVar5 = (C9141ad) yVar.build();
                            adVar5.getClass();
                            vVar2.f32169C = adVar5;
                            vVar2.f32192a |= 67108864;
                            vVar = (C9278v) qVar.build();
                            this.f290310e = vVar;
                        }
                    }
                    View findViewById = recyclerViewStub.findViewById(R.id.video_interception_view);
                    if (findViewById != null) {
                        C9141ad adVar6 = vVar.f32169C;
                        if (adVar6 == null) {
                            adVar6 = C9141ad.f31521K;
                        }
                        mo94103B(findViewById, adVar6);
                    }
                    Optional empty = Optional.empty();
                    C104435al alVar = this.f290321p;
                    if (alVar != null) {
                        Objects.requireNonNull(alVar);
                        empty = Optional.m71637of(new C104924av(alVar));
                    }
                    Optional optional = empty;
                    ViewGroup viewGroup2 = this.f292378Q;
                    if (viewGroup2 != null) {
                        C91885i iVar = this.f292370I;
                        C9141ad adVar7 = vVar.f32169C;
                        if (adVar7 == null) {
                            adVar7 = C9141ad.f31521K;
                        }
                        C9215cx cxVar5 = adVar7.f31555u;
                        if (cxVar5 == null) {
                            cxVar5 = C9215cx.f31837o;
                        }
                        C9215cx cxVar6 = cxVar5;
                        C7718hj hjVar = vVar.f32174H;
                        if (hjVar == null) {
                            hjVar = C7718hj.f26927af;
                        }
                        iVar.mo86425e(viewGroup2, cxVar6, hjVar.f26969j, a2, optional);
                        this.f292380S = true;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo94018b(LayoutInflater layoutInflater) {
        C9277u a = C9277u.m23705a(this.f290310e.f32196c);
        if (a == null) {
            a = C9277u.UNKNOWN;
        }
        return mo94019c(a, mo94115i());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007e, code lost:
        r3 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0096, code lost:
        r3 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010b, code lost:
        r3 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0110, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0111, code lost:
        r5 = com.google.android.googlequicksearchbox.R.layout.qp_module_small_image_right;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x011c, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011e, code lost:
        r3 = null;
        r5 = com.google.android.googlequicksearchbox.R.layout.qp_module_list_row;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0122, code lost:
        r1 = new com.google.common.base.C58835az(java.lang.Integer.valueOf(r5), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r3 = (java.lang.Integer) r1.f156632b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0131, code lost:
        if (r3 == null) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0133, code lost:
        r8.f290308c.f256405a.getTheme().applyStyle(r3.intValue(), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0142, code lost:
        r8.f290311f = r8.f290308c.f256406b.inflate(((java.lang.Integer) r1.f156631a).intValue(), r10, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0155, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0156, code lost:
        r8.f292383V = true;
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) f292361E.mo56225c()).mo56382g(r1)).mo56372aa(22074)).mo56387q("Failed to inflate CardModule type: %d", r9.f32164ay);
        r8.f290311f = r8.f290308c.f256406b.inflate(com.google.android.googlequicksearchbox.R.layout.qp_module_list_row, r10, false);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo94019c(com.google.android.apps.p489g.p494d.C9277u r9, android.view.ViewGroup r10) {
        /*
            r8 = this;
            com.google.android.sidekick.shared.remoteapi.CardRenderingContext r0 = r8.mo94120n()
            com.google.android.apps.g.d.u r1 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
            int r1 = r9.ordinal()
            r2 = 2132153011(0x7f1612b3, float:1.994813E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2132153013(0x7f1612b5, float:1.9948133E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 2131626613(0x7f0e0a75, float:1.8880467E38)
            r5 = 2131626624(0x7f0e0a80, float:1.888049E38)
            r6 = 2131626629(0x7f0e0a85, float:1.88805E38)
            r7 = 0
            switch(r1) {
                case 19: goto L_0x011e;
                case 20: goto L_0x0119;
                case 21: goto L_0x0115;
                case 22: goto L_0x0110;
                case 23: goto L_0x0110;
                case 24: goto L_0x0110;
                case 25: goto L_0x0122;
                case 26: goto L_0x0122;
                case 27: goto L_0x0108;
                case 28: goto L_0x0104;
                case 29: goto L_0x0100;
                case 30: goto L_0x00fc;
                case 31: goto L_0x00f8;
                case 32: goto L_0x00f4;
                case 33: goto L_0x00f0;
                case 34: goto L_0x00ec;
                case 35: goto L_0x0110;
                case 36: goto L_0x0110;
                case 37: goto L_0x0110;
                case 38: goto L_0x0110;
                case 39: goto L_0x0110;
                case 40: goto L_0x0110;
                case 41: goto L_0x0025;
                case 42: goto L_0x00e8;
                case 43: goto L_0x00e4;
                case 44: goto L_0x0025;
                case 45: goto L_0x0025;
                case 46: goto L_0x0025;
                case 47: goto L_0x0025;
                case 48: goto L_0x0025;
                case 49: goto L_0x0025;
                case 50: goto L_0x0025;
                case 51: goto L_0x0025;
                case 52: goto L_0x0025;
                case 53: goto L_0x0110;
                case 54: goto L_0x0025;
                case 55: goto L_0x00ce;
                case 56: goto L_0x00ce;
                case 57: goto L_0x00b8;
                case 58: goto L_0x00ac;
                case 59: goto L_0x009c;
                case 60: goto L_0x0093;
                case 61: goto L_0x0025;
                case 62: goto L_0x0085;
                case 63: goto L_0x0085;
                case 64: goto L_0x0085;
                case 65: goto L_0x0025;
                case 66: goto L_0x0071;
                case 67: goto L_0x006c;
                case 68: goto L_0x0060;
                case 69: goto L_0x0051;
                case 70: goto L_0x004c;
                case 71: goto L_0x0047;
                case 72: goto L_0x0042;
                case 73: goto L_0x0025;
                case 74: goto L_0x003e;
                default: goto L_0x0025;
            }
        L_0x0025:
            com.google.common.f.e r0 = f292361E
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 22075(0x563b, float:3.0934E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r1 = "Bad NowModule layout specification: %d"
            int r2 = r9.f32164ay
            r0.mo56387q(r1, r2)
            goto L_0x011e
        L_0x003e:
            r0 = 2132153031(0x7f1612c7, float:1.994817E38)
            goto L_0x0096
        L_0x0042:
            r5 = 2131625590(0x7f0e0676, float:1.8878392E38)
            goto L_0x011c
        L_0x0047:
            r5 = 2131625594(0x7f0e067a, float:1.88784E38)
            goto L_0x011c
        L_0x004c:
            r5 = 2131625582(0x7f0e066e, float:1.8878376E38)
            goto L_0x011c
        L_0x0051:
            com.google.android.apps.g.d.v r0 = r8.f290310e
            int r0 = r0.f32195b
            r0 = r0 & 16
            if (r0 == 0) goto L_0x005a
            r2 = r7
        L_0x005a:
            r5 = 2131626630(0x7f0e0a86, float:1.8880502E38)
            r3 = r2
            goto L_0x0122
        L_0x0060:
            com.google.android.apps.g.d.v r0 = r8.f290310e
            int r0 = r0.f32195b
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0069
            r2 = r7
        L_0x0069:
            r3 = r2
            goto L_0x0111
        L_0x006c:
            r0 = 2132153036(0x7f1612cc, float:1.994818E38)
            goto L_0x010b
        L_0x0071:
            com.google.android.apps.g.d.v r0 = r8.f290310e
            int r0 = r0.f32195b
            r0 = r0 & 16
            if (r0 == 0) goto L_0x007b
            goto L_0x0110
        L_0x007b:
            r0 = 2132153008(0x7f1612b0, float:1.9948123E38)
        L_0x007e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = r0
            goto L_0x0111
        L_0x0085:
            com.google.android.apps.g.d.v r0 = r8.f290310e
            int r0 = r0.f32195b
            r0 = r0 & 16
            if (r0 == 0) goto L_0x008f
            goto L_0x0110
        L_0x008f:
            r0 = 2132153010(0x7f1612b2, float:1.9948127E38)
            goto L_0x007e
        L_0x0093:
            r0 = 2132153037(0x7f1612cd, float:1.9948182E38)
        L_0x0096:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            goto L_0x0111
        L_0x009c:
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r0.mo49316k()
            if (r0 == 0) goto L_0x00a8
            r0 = 2132153026(0x7f1612c2, float:1.994816E38)
            goto L_0x0096
        L_0x00a8:
            r0 = 2132153025(0x7f1612c1, float:1.9948158E38)
            goto L_0x0096
        L_0x00ac:
            r0 = 2132153023(0x7f1612bf, float:1.9948153E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r5 = 2131625507(0x7f0e0623, float:1.8878224E38)
            goto L_0x0122
        L_0x00b8:
            r1 = 2131625598(0x7f0e067e, float:1.8878408E38)
            if (r0 == 0) goto L_0x00ca
            boolean r0 = r0.mo49317l()
            if (r0 == 0) goto L_0x00ca
            r0 = 2131625599(0x7f0e067f, float:1.887841E38)
            r5 = 2131625599(0x7f0e067f, float:1.887841E38)
            goto L_0x011c
        L_0x00ca:
            r5 = 2131625598(0x7f0e067e, float:1.8878408E38)
            goto L_0x011c
        L_0x00ce:
            r1 = 2131625597(0x7f0e067d, float:1.8878406E38)
            if (r0 == 0) goto L_0x00e0
            boolean r0 = r0.mo49317l()
            if (r0 == 0) goto L_0x00e0
            r0 = 2131625600(0x7f0e0680, float:1.8878413E38)
            r5 = 2131625600(0x7f0e0680, float:1.8878413E38)
            goto L_0x011c
        L_0x00e0:
            r5 = 2131625597(0x7f0e067d, float:1.8878406E38)
            goto L_0x011c
        L_0x00e4:
            r5 = 2131626628(0x7f0e0a84, float:1.8880498E38)
            goto L_0x011c
        L_0x00e8:
            r5 = 2131626636(0x7f0e0a8c, float:1.8880514E38)
            goto L_0x011c
        L_0x00ec:
            r5 = 2131626607(0x7f0e0a6f, float:1.8880455E38)
            goto L_0x011c
        L_0x00f0:
            r0 = 2132153014(0x7f1612b6, float:1.9948135E38)
            goto L_0x010b
        L_0x00f4:
            r5 = 2131626625(0x7f0e0a81, float:1.8880491E38)
            goto L_0x0122
        L_0x00f8:
            r0 = 2132153016(0x7f1612b8, float:1.994814E38)
            goto L_0x010b
        L_0x00fc:
            r0 = 2132153015(0x7f1612b7, float:1.9948137E38)
            goto L_0x010b
        L_0x0100:
            r5 = 2131626627(0x7f0e0a83, float:1.8880496E38)
            goto L_0x011c
        L_0x0104:
            r5 = 2131626626(0x7f0e0a82, float:1.8880494E38)
            goto L_0x011c
        L_0x0108:
            r0 = 2132153017(0x7f1612b9, float:1.9948141E38)
        L_0x010b:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            goto L_0x0122
        L_0x0110:
            r3 = r7
        L_0x0111:
            r5 = 2131626629(0x7f0e0a85, float:1.88805E38)
            goto L_0x0122
        L_0x0115:
            r5 = 2131626610(0x7f0e0a72, float:1.8880461E38)
            goto L_0x011c
        L_0x0119:
            r5 = 2131626611(0x7f0e0a73, float:1.8880463E38)
        L_0x011c:
            r3 = r7
            goto L_0x0122
        L_0x011e:
            r3 = r7
            r5 = 2131626613(0x7f0e0a75, float:1.8880467E38)
        L_0x0122:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            com.google.common.base.az r1 = new com.google.common.base.az
            r1.<init>(r0, r3)
            r0 = 0
            r2 = 1
            java.lang.Object r3 = r1.f156632b     // Catch:{ InflateException -> 0x0155 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ InflateException -> 0x0155 }
            if (r3 == 0) goto L_0x0142
            com.google.android.apps.gsa.sidekick.shared.ui.p r5 = r8.f290308c     // Catch:{ InflateException -> 0x0155 }
            android.view.ContextThemeWrapper r5 = r5.f256405a     // Catch:{ InflateException -> 0x0155 }
            android.content.res.Resources$Theme r5 = r5.getTheme()     // Catch:{ InflateException -> 0x0155 }
            int r3 = r3.intValue()     // Catch:{ InflateException -> 0x0155 }
            r5.applyStyle(r3, r2)     // Catch:{ InflateException -> 0x0155 }
        L_0x0142:
            java.lang.Object r1 = r1.f156631a     // Catch:{ InflateException -> 0x0155 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ InflateException -> 0x0155 }
            int r1 = r1.intValue()     // Catch:{ InflateException -> 0x0155 }
            com.google.android.apps.gsa.sidekick.shared.ui.p r3 = r8.f290308c     // Catch:{ InflateException -> 0x0155 }
            android.view.LayoutInflater r3 = r3.f256406b     // Catch:{ InflateException -> 0x0155 }
            android.view.View r1 = r3.inflate(r1, r10, r0)     // Catch:{ InflateException -> 0x0155 }
            r8.f290311f = r1     // Catch:{ InflateException -> 0x0155 }
            goto L_0x017f
        L_0x0155:
            r1 = move-exception
            r8.f292383V = r2
            com.google.common.f.e r2 = f292361E
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.x r1 = r2.mo56382g(r1)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r2 = 22074(0x563a, float:3.0932E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            java.lang.String r2 = "Failed to inflate CardModule type: %d"
            int r9 = r9.f32164ay
            r1.mo56387q(r2, r9)
            com.google.android.apps.gsa.sidekick.shared.ui.p r9 = r8.f290308c
            android.view.LayoutInflater r9 = r9.f256406b
            android.view.View r9 = r9.inflate(r4, r10, r0)
            r8.f290311f = r9
        L_0x017f:
            android.view.View r9 = r8.f290311f
            r10 = 2131432182(0x7f0b12f6, float:1.8486114E38)
            android.view.View r10 = r9.findViewById(r10)
            com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView r10 = (com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.MetadataLineView) r10
            r8.f292385z = r10
            r10 = 2131430183(0x7f0b0b27, float:1.848206E38)
            android.view.View r10 = r9.findViewById(r10)
            com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView r10 = (com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.MetadataLineView) r10
            r8.f292364B = r10
            r10 = 2131429170(0x7f0b0732, float:1.8480005E38)
            android.view.View r10 = r9.findViewById(r10)
            com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView r10 = (com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.MetadataLineView) r10
            r8.f292363A = r10
            r10 = 2131436530(0x7f0b23f2, float:1.8494933E38)
            android.view.View r10 = r9.findViewById(r10)
            r8.f292372K = r10
            r10 = 2131431115(0x7f0b0ecb, float:1.848395E38)
            android.view.View r10 = r9.findViewById(r10)
            com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView r10 = (com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.MetadataLineView) r10
            r8.f292365C = r10
            r10 = 2131430635(0x7f0b0ceb, float:1.8482977E38)
            android.view.View r10 = r9.findViewById(r10)
            com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView r10 = (com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.MetadataLineView) r10
            r8.f292366D = r10
            r10 = 2131434510(0x7f0b1c0e, float:1.8490836E38)
            android.view.View r10 = r9.findViewById(r10)
            com.google.android.apps.gsa.now.shared.ui.RecyclerViewStub r10 = (com.google.android.apps.gsa.now.shared.p6421ui.RecyclerViewStub) r10
            r8.f292374M = r10
            r10 = 2131430185(0x7f0b0b29, float:1.8482064E38)
            android.view.View r10 = r9.findViewById(r10)
            com.google.android.apps.gsa.now.shared.ui.RecyclerViewStub r10 = (com.google.android.apps.gsa.now.shared.p6421ui.RecyclerViewStub) r10
            r8.f292375N = r10
            r10 = 2131427503(0x7f0b00af, float:1.8476624E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            r8.f292373L = r10
            r10 = 2131436507(0x7f0b23db, float:1.8494886E38)
            android.view.View r10 = r9.findViewById(r10)
            r8.f292377P = r10
            java.util.List r10 = r8.f292381T
            r0 = 2131429699(0x7f0b0943, float:1.8481078E38)
            android.view.View r0 = r9.findViewById(r0)
            r10.add(r0)
            java.util.List r10 = r8.f292381T
            r0 = 2131429700(0x7f0b0944, float:1.848108E38)
            android.view.View r9 = r9.findViewById(r0)
            r10.add(r9)
            java.util.List r9 = r8.f292381T
            com.google.common.base.bh r10 = com.google.common.base.C58844bh.IS_NULL
            com.google.common.p4522b.C58557jl.m90145z(r9, r10)
            com.google.android.apps.gsa.now.shared.ui.RecyclerViewStub r9 = r8.f292374M
            if (r9 == 0) goto L_0x0212
            int r9 = r9.f227323a
            r8.f292382U = r9
        L_0x0212:
            android.view.View r9 = r8.f290311f
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104928az.mo94019c(com.google.android.apps.g.d.u, android.view.ViewGroup):android.view.View");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0143, code lost:
        if (r1 == com.google.android.apps.p489g.p494d.C9277u.HERO_IMAGE_RIGHT) goto L_0x0145;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0432  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x045c  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0462  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x04ac  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x04d5  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0643  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x076e  */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x07e3  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x07f5  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x07fa  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0803  */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x08e6  */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x0932  */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x09d6  */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x09ef  */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x0a28  */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x0a34  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:471:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0187  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94020e() {
        /*
            r28 = this;
            r7 = r28
            android.view.View r8 = r7.f290311f
            com.google.android.apps.g.d.v r9 = r7.f290310e
            com.google.android.apps.g.d.bx r0 = r9.f32210q
            if (r0 != 0) goto L_0x000c
            com.google.android.apps.g.d.bx r0 = com.google.android.apps.p489g.p494d.C9188bx.f31714x
        L_0x000c:
            r10 = r0
            int r0 = r8.getPaddingTop()
            int r1 = r8.getPaddingBottom()
            int r2 = r9.f32195b
            r2 = r2 & 128(0x80, float:1.794E-43)
            r11 = 1
            r12 = 0
            if (r2 == 0) goto L_0x0033
            com.google.android.apps.g.d.v r2 = r9.f32182P
            if (r2 != 0) goto L_0x0024
            com.google.android.apps.g.d.v r3 = com.google.android.apps.p489g.p494d.C9278v.f32165Z
            goto L_0x0025
        L_0x0024:
            r3 = r2
        L_0x0025:
            boolean r3 = r3.f32181O
            if (r3 == 0) goto L_0x0033
            if (r2 != 0) goto L_0x002d
            com.google.android.apps.g.d.v r2 = com.google.android.apps.p489g.p494d.C9278v.f32165Z
        L_0x002d:
            int r2 = r2.f32167A
            if (r2 != 0) goto L_0x0033
            r13 = 1
            goto L_0x0034
        L_0x0033:
            r13 = 0
        L_0x0034:
            int r2 = r10.f31734s
            if (r2 <= 0) goto L_0x0040
            float r0 = (float) r2
            android.content.Context r2 = r7.f290307b
            float r0 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r0, r2)
            int r0 = (int) r0
        L_0x0040:
            r14 = 2131169610(0x7f07114a, float:1.7953555E38)
            if (r13 == 0) goto L_0x0054
            android.content.Context r2 = r7.f290307b
            android.content.res.Resources r2 = r2.getResources()
            int r2 = r2.getDimensionPixelSize(r14)
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r0, r12)
        L_0x0054:
            r15 = r0
            int r0 = r10.f31735t
            if (r0 <= 0) goto L_0x0061
            float r0 = (float) r0
            android.content.Context r1 = r7.f290307b
            float r0 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r0, r1)
            int r1 = (int) r0
        L_0x0061:
            int r0 = r8.getPaddingLeft()
            int r2 = r8.getPaddingRight()
            r8.setPadding(r0, r15, r2, r1)
            com.google.android.apps.g.d.ad r0 = r9.f32169C
            if (r0 != 0) goto L_0x0072
            com.google.android.apps.g.d.ad r0 = com.google.android.apps.p489g.p494d.C9141ad.f31521K
        L_0x0072:
            int r0 = r0.f31535a
            r1 = 4
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0085
            com.google.android.apps.g.d.ad r0 = r9.f32169C
            if (r0 != 0) goto L_0x007e
            com.google.android.apps.g.d.ad r0 = com.google.android.apps.p489g.p494d.C9141ad.f31521K
        L_0x007e:
            com.google.android.apps.g.d.b r0 = r0.f31539e
            if (r0 != 0) goto L_0x0091
            com.google.android.apps.g.d.b r0 = com.google.android.apps.p489g.p494d.C9164b.f31642o
            goto L_0x0091
        L_0x0085:
            int r0 = r10.f31716a
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0093
            com.google.android.apps.g.d.b r0 = r10.f31729n
            if (r0 != 0) goto L_0x0091
            com.google.android.apps.g.d.b r0 = com.google.android.apps.p489g.p494d.C9164b.f31642o
        L_0x0091:
            r5 = r0
            goto L_0x0094
        L_0x0093:
            r5 = 0
        L_0x0094:
            int r0 = r10.f31731p
            if (r0 <= 0) goto L_0x009b
            r8.setMinimumHeight(r0)
        L_0x009b:
            if (r5 == 0) goto L_0x00a9
            int r0 = r9.f32178L
            int r0 = com.google.android.apps.p489g.p494d.C9275s.m23704a(r0)
            if (r0 != 0) goto L_0x00a6
            r0 = 1
        L_0x00a6:
            r7.mo94112K(r8, r5, r0)
        L_0x00a9:
            com.google.android.apps.gsa.sidekick.shared.ui.p r0 = r7.f290308c
            int r0 = r0.f256407c
            com.google.android.sidekick.shared.remoteapi.CardRenderingContext r2 = r28.mo94120n()
            com.google.android.apps.gsa.staticplugins.nowcards.ui.g r3 = r7.f292369H
            android.content.Context r4 = r7.f290307b
            com.google.android.apps.gsa.sidekick.shared.ui.p r6 = r7.f290308c
            android.view.LayoutInflater r6 = r6.f256406b
            int r14 = r10.f31733r
            int r14 = com.google.android.apps.p489g.p494d.C9187bw.m23684a(r14)
            if (r14 != 0) goto L_0x00c2
            r14 = 1
        L_0x00c2:
            java.util.Map r14 = com.google.android.apps.gsa.staticplugins.nowcards.p8119i.C105048f.m174271d(r14)
            com.google.android.apps.gsa.staticplugins.nowcards.ui.f r14 = r3.mo94516a(r4, r6, r14, r2)
            boolean r3 = r7.f290318m
            com.google.android.apps.gsa.staticplugins.nowcards.ui.e r4 = r14.f292793e
            r4.mo94509a(r3)
            com.google.protobuf.cq r3 = r10.f31717b
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0180
            com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView r3 = r7.f292385z
            if (r3 == 0) goto L_0x015d
            r3.f292772b = r0
            com.google.protobuf.cq r4 = r10.f31717b
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r6 = r7.f290314i
            com.google.android.apps.gsa.now.shared.ui.j r6 = r6.f290349s
            r3.mo94502d(r14, r4, r6)
            int r3 = r9.f32196c
            com.google.android.apps.g.d.u r3 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r3)
            if (r3 != 0) goto L_0x00f2
            com.google.android.apps.g.d.u r3 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x00f2:
            com.google.android.apps.g.d.u r4 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CENTERED_ICON
            if (r3 != r4) goto L_0x0123
            com.google.protobuf.cq r3 = r10.f31717b
            com.google.common.b.eu r3 = com.google.common.p4522b.C58431eu.m89654f(r3)
            com.google.android.apps.gsa.staticplugins.nowcards.g.aw r4 = com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104925aw.f292359a
            com.google.common.b.eu r3 = r3.mo55246e(r4)
            com.google.android.apps.gsa.staticplugins.nowcards.g.ax r4 = new com.google.android.apps.gsa.staticplugins.nowcards.g.ax
            r4.<init>(r7)
            com.google.common.b.eu r3 = r3.mo55247g(r4)
            java.lang.Iterable r3 = r3.mo55248h()
            com.google.common.b.gu r3 = com.google.common.p4522b.C58485gu.m89841i(r3)
            android.view.View r4 = r7.f290311f
            com.google.common.base.ar r6 = new com.google.common.base.ar
            java.lang.String r1 = " "
            r6.<init>((java.lang.String) r1)
            java.lang.String r1 = r6.mo56097d(r3)
            r4.setContentDescription(r1)
        L_0x0123:
            if (r2 == 0) goto L_0x0180
            boolean r1 = r2.mo49315j()
            if (r1 == 0) goto L_0x0180
            int r1 = r9.f32196c
            com.google.android.apps.g.d.u r2 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r1)
            if (r2 != 0) goto L_0x0135
            com.google.android.apps.g.d.u r2 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x0135:
            com.google.android.apps.g.d.u r3 = com.google.android.apps.p489g.p494d.C9277u.HERO_IMAGE_CENTER
            if (r2 == r3) goto L_0x0145
            com.google.android.apps.g.d.u r1 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r1)
            if (r1 != 0) goto L_0x0141
            com.google.android.apps.g.d.u r1 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x0141:
            com.google.android.apps.g.d.u r2 = com.google.android.apps.p489g.p494d.C9277u.HERO_IMAGE_RIGHT
            if (r1 != r2) goto L_0x0180
        L_0x0145:
            com.google.android.apps.gsa.staticplugins.nowcards.base.aw r1 = new com.google.android.apps.gsa.staticplugins.nowcards.base.aw
            r1.<init>(r11)
            r8.setAccessibilityDelegate(r1)
            com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView r1 = r7.f292385z
            com.google.android.apps.gsa.staticplugins.nowcards.base.ax r2 = new com.google.android.apps.gsa.staticplugins.nowcards.base.ax
            r2.<init>(r12)
            r1.setAccessibilityDelegate(r2)
            com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView r1 = r7.f292385z
            r1.setImportantForAccessibility(r11)
            goto L_0x0180
        L_0x015d:
            com.google.common.f.e r1 = f292361E
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r2 = 22082(0x5642, float:3.0943E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.android.apps.g.d.v r2 = r7.f290310e
            int r2 = r2.f32196c
            com.google.android.apps.g.d.u r2 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r2)
            if (r2 != 0) goto L_0x0179
            com.google.android.apps.g.d.u r2 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x0179:
            java.lang.String r3 = "Header container not defined for type: %d"
            int r2 = r2.f32164ay
            r1.mo56387q(r3, r2)
        L_0x0180:
            int r1 = r10.f31716a
            r2 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x01fd
            int r1 = r8.getPaddingLeft()
            int r2 = r8.getPaddingTop()
            int r3 = r8.getPaddingRight()
            r8.setPadding(r1, r2, r3, r12)
            android.widget.LinearLayout r1 = r7.f292373L
            if (r1 == 0) goto L_0x01c2
            int r1 = r1.getChildCount()
            if (r1 != 0) goto L_0x01c2
            android.widget.LinearLayout r1 = r7.f292373L
            com.google.ai.b.rv r2 = r10.f31737v
            if (r2 != 0) goto L_0x01a8
            com.google.ai.b.rv r2 = com.google.p375ai.p378b.C8000rv.f28111e
        L_0x01a8:
            com.google.protobuf.cq r2 = r2.f28115c
            java.util.Iterator r2 = r2.iterator()
        L_0x01ae:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01c2
            java.lang.Object r3 = r2.next()
            com.google.ai.b.mh r3 = (com.google.p375ai.p378b.C7851mh) r3
            com.google.android.apps.gsa.staticplugins.nowcards.base.bj r3 = r7.mo94119m(r3, r14)
            r1.addView(r3)
            goto L_0x01ae
        L_0x01c2:
            com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView r1 = r7.f292363A
            if (r1 == 0) goto L_0x01fd
            r1.f292772b = r0
            com.google.ai.b.rv r2 = r10.f31737v
            if (r2 != 0) goto L_0x01ce
            com.google.ai.b.rv r2 = com.google.p375ai.p378b.C8000rv.f28111e
        L_0x01ce:
            com.google.protobuf.cq r2 = r2.f28114b
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r3 = r7.f290314i
            com.google.android.apps.gsa.now.shared.ui.j r3 = r3.f290349s
            r1.mo94502d(r14, r2, r3)
            com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView r1 = r7.f292363A
            r1.setVisibility(r12)
            android.view.View r1 = r7.f292372K
            if (r1 == 0) goto L_0x01e3
            r1.setVisibility(r12)
        L_0x01e3:
            com.google.ai.b.rv r1 = r10.f31737v
            if (r1 != 0) goto L_0x01ea
            com.google.ai.b.rv r2 = com.google.p375ai.p378b.C8000rv.f28111e
            goto L_0x01eb
        L_0x01ea:
            r2 = r1
        L_0x01eb:
            int r2 = r2.f28113a
            r2 = r2 & r11
            if (r2 == 0) goto L_0x01fd
            android.util.SparseArray r2 = r7.f290327v
            if (r1 != 0) goto L_0x01f6
            com.google.ai.b.rv r1 = com.google.p375ai.p378b.C8000rv.f28111e
        L_0x01f6:
            int r1 = r1.f28116d
            com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView r3 = r7.f292363A
            r2.put(r1, r3)
        L_0x01fd:
            com.google.protobuf.cq r1 = r10.f31718c
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0238
            com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView r1 = r7.f292364B
            if (r1 == 0) goto L_0x0215
            r1.f292772b = r0
            com.google.protobuf.cq r2 = r10.f31718c
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r3 = r7.f290314i
            com.google.android.apps.gsa.now.shared.ui.j r3 = r3.f290349s
            r1.mo94502d(r14, r2, r3)
            goto L_0x0238
        L_0x0215:
            com.google.common.f.e r1 = f292361E
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r2 = 22081(0x5641, float:3.0942E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.android.apps.g.d.v r2 = r7.f290310e
            int r2 = r2.f32196c
            com.google.android.apps.g.d.u r2 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r2)
            if (r2 != 0) goto L_0x0231
            com.google.android.apps.g.d.u r2 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x0231:
            java.lang.String r3 = "Details container not defined for type: %d"
            int r2 = r2.f32164ay
            r1.mo56387q(r3, r2)
        L_0x0238:
            int r1 = r10.f31716a
            r1 = r1 & r11
            if (r1 == 0) goto L_0x026e
            r1 = 2131430184(0x7f0b0b28, float:1.8482062E38)
            android.view.View r1 = r8.findViewById(r1)
            if (r1 == 0) goto L_0x026e
            com.google.android.apps.gsa.now.shared.ui.RecyclerViewStub r2 = r7.f292375N
            if (r2 == 0) goto L_0x026e
            r3 = 2131627156(0x7f0e0c94, float:1.8881568E38)
            r2.f227323a = r3
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r3 = r7.f290314i
            com.google.android.apps.gsa.now.shared.ui.j r3 = r3.f290349s
            r2.mo76716c(r3)
            com.google.android.apps.gsa.now.shared.ui.RecyclerViewStub r2 = r7.f292375N
            android.view.View r2 = r2.mo76714a()
            r1.setVisibility(r12)
            r2.setVisibility(r12)
            com.google.android.apps.g.d.b r2 = r10.f31719d
            if (r2 != 0) goto L_0x0268
            com.google.android.apps.g.d.b r2 = com.google.android.apps.p489g.p494d.C9164b.f31642o
        L_0x0268:
            r3 = 2131432338(0x7f0b1392, float:1.848643E38)
            r7.mo94130y(r1, r2, r3, r12)
        L_0x026e:
            com.google.protobuf.cq r1 = r10.f31720e
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x02a9
            com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView r1 = r7.f292365C
            if (r1 == 0) goto L_0x0286
            r1.f292772b = r0
            com.google.protobuf.cq r2 = r10.f31720e
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r3 = r7.f290314i
            com.google.android.apps.gsa.now.shared.ui.j r3 = r3.f290349s
            r1.mo94502d(r14, r2, r3)
            goto L_0x02a9
        L_0x0286:
            com.google.common.f.e r1 = f292361E
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r2 = 22080(0x5640, float:3.094E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.android.apps.g.d.v r2 = r7.f290310e
            int r2 = r2.f32196c
            com.google.android.apps.g.d.u r2 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r2)
            if (r2 != 0) goto L_0x02a2
            com.google.android.apps.g.d.u r2 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x02a2:
            java.lang.String r3 = "Footers container not defined for type: %d"
            int r2 = r2.f32164ay
            r1.mo56387q(r3, r2)
        L_0x02a9:
            int r1 = r10.f31716a
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x02ea
            com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView r1 = r7.f292366D
            if (r1 == 0) goto L_0x02c7
            r1.f292772b = r0
            com.google.ai.b.lb r0 = r10.f31728m
            if (r0 != 0) goto L_0x02bb
            com.google.ai.b.lb r0 = com.google.p375ai.p378b.C7818lb.f27416n
        L_0x02bb:
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89846n(r0)
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r2 = r7.f290314i
            com.google.android.apps.gsa.now.shared.ui.j r2 = r2.f290349s
            r1.mo94502d(r14, r0, r2)
            goto L_0x02ea
        L_0x02c7:
            com.google.common.f.e r0 = f292361E
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 22079(0x563f, float:3.0939E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.android.apps.g.d.v r1 = r7.f290310e
            int r1 = r1.f32196c
            com.google.android.apps.g.d.u r1 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r1)
            if (r1 != 0) goto L_0x02e3
            com.google.android.apps.g.d.u r1 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x02e3:
            java.lang.String r2 = "Extra info container not defined for type: %d"
            int r1 = r1.f32164ay
            r0.mo56387q(r2, r1)
        L_0x02ea:
            int r0 = r9.f32196c
            com.google.android.apps.g.d.u r0 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r0)
            if (r0 != 0) goto L_0x02f4
            com.google.android.apps.g.d.u r0 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x02f4:
            r6 = r0
            com.google.android.apps.g.d.u r0 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CAROUSEL_TWO_TONE_ICON
            if (r6 != r0) goto L_0x0308
            android.content.Context r0 = r7.f290307b
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131171582(0x7f0718fe, float:1.7957555E38)
            int r0 = r0.getDimensionPixelSize(r1)
            r4 = r0
            goto L_0x0309
        L_0x0308:
            r4 = 0
        L_0x0309:
            com.google.android.apps.g.d.cj r0 = com.google.android.apps.p489g.p494d.C9201cj.f31773u
            com.google.android.apps.g.d.cj r1 = r10.f31721f
            if (r1 != 0) goto L_0x0310
            r1 = r0
        L_0x0310:
            boolean r0 = r0.equals(r1)
            r3 = 2
            r2 = 3
            r11 = 8
            if (r0 != 0) goto L_0x0643
            int r0 = r10.f31724i
            int r0 = com.google.android.apps.p489g.p494d.C9185bu.m23683a(r0)
            if (r0 != 0) goto L_0x0324
            goto L_0x039c
        L_0x0324:
            if (r0 != r2) goto L_0x039c
            com.google.android.apps.g.d.cj r0 = r10.f31721f
            if (r0 != 0) goto L_0x032c
            com.google.android.apps.g.d.cj r0 = com.google.android.apps.p489g.p494d.C9201cj.f31773u
        L_0x032c:
            com.google.android.apps.gsa.now.shared.ui.RecyclerViewStub r1 = r7.f292374M
            if (r1 != 0) goto L_0x034d
            com.google.common.f.e r0 = f292361E
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "Layout doesn't contain a photo_stub to setup the image logo"
            r2 = 22077(0x563d, float:3.0936E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
        L_0x033d:
            r26 = r4
            r25 = r9
            r24 = r13
            r23 = r15
            r9 = 2131434489(0x7f0b1bf9, float:1.8490793E38)
            r11 = 3
            r12 = 2
            r15 = r5
            goto L_0x06f1
        L_0x034d:
            r2 = 2131626637(0x7f0e0a8d, float:1.8880516E38)
            r1.f227323a = r2
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r2 = r7.f290314i
            com.google.android.apps.gsa.now.shared.ui.j r2 = r2.f290349s
            r1.mo76716c(r2)
            com.google.android.apps.gsa.now.shared.ui.RecyclerViewStub r1 = r7.f292374M
            android.view.View r1 = r1.mo76714a()
            r1.setVisibility(r12)
            int r2 = r0.f31775a
            r17 = r2 & 16
            r12 = 2131432996(0x7f0b1624, float:1.8487765E38)
            if (r17 == 0) goto L_0x038a
            r2 = r2 & r11
            if (r2 == 0) goto L_0x038a
            com.google.android.apps.g.d.u r2 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CAROUSEL_WEB_LOGO
            if (r6 != r2) goto L_0x038a
            r2 = r1
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r11 = 17
            r2.setGravity(r11)
            android.view.View r1 = r1.findViewById(r12)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            int r2 = r0.f31782h
            r1.height = r2
            int r2 = r0.f31781g
            r1.width = r2
        L_0x038a:
            boolean r1 = r7.f290318m
            if (r1 == 0) goto L_0x0396
            int r1 = r0.f31775a
            r1 = r1 & r3
            if (r1 == 0) goto L_0x0396
            java.lang.String r0 = r0.f31777c
            goto L_0x0398
        L_0x0396:
            java.lang.String r0 = r0.f31776b
        L_0x0398:
            r7.mo94117k(r8, r12, r0)
            goto L_0x033d
        L_0x039c:
            com.google.android.apps.g.d.cj r0 = r10.f31721f
            if (r0 != 0) goto L_0x03a2
            com.google.android.apps.g.d.cj r0 = com.google.android.apps.p489g.p494d.C9201cj.f31773u
        L_0x03a2:
            r11 = r0
            int r0 = r10.f31725j
            int r0 = com.google.p375ai.p378b.C7787jy.m22849a(r0)
            if (r0 != 0) goto L_0x03ad
            r12 = 1
            goto L_0x03ae
        L_0x03ad:
            r12 = r0
        L_0x03ae:
            boolean r2 = r10.f31726k
            boolean r1 = r10.f31727l
            com.google.android.apps.gsa.now.shared.ui.RecyclerViewStub r0 = r7.f292374M
            r23 = r15
            if (r0 == 0) goto L_0x04ee
            com.google.android.apps.g.d.v r3 = r7.f290310e
            int r15 = r3.f32192a
            r22 = 67108864(0x4000000, float:1.5046328E-36)
            r15 = r15 & r22
            if (r15 == 0) goto L_0x03d5
            com.google.android.apps.g.d.ad r3 = r3.f32169C
            if (r3 != 0) goto L_0x03c8
            com.google.android.apps.g.d.ad r3 = com.google.android.apps.p489g.p494d.C9141ad.f31521K
        L_0x03c8:
            int r3 = r3.f31535a
            r15 = 1048576(0x100000, float:1.469368E-39)
            r3 = r3 & r15
            if (r3 == 0) goto L_0x03d5
            r3 = 2131625709(0x7f0e06ed, float:1.8878634E38)
            r0.f227323a = r3
            goto L_0x03d9
        L_0x03d5:
            int r3 = r7.f292382U
            r0.f227323a = r3
        L_0x03d9:
            if (r11 == 0) goto L_0x0418
            int r3 = r11.f31775a
            r15 = 1
            r3 = r3 & r15
            if (r3 == 0) goto L_0x0418
            r3 = 2131434510(0x7f0b1c0e, float:1.8490836E38)
            android.view.View r3 = r8.findViewById(r3)
            com.google.android.apps.gsa.now.shared.ui.RecyclerViewStub r3 = (com.google.android.apps.gsa.now.shared.p6421ui.RecyclerViewStub) r3
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r15 = r7.f290314i
            com.google.android.apps.gsa.now.shared.ui.j r15 = r15.f290349s
            r3.mo76716c(r15)
            android.view.View r3 = r3.mo76714a()
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r15 = r7.f290314i
            boolean r15 = r15.f290335e
            r24 = r13
            r13 = r0
            r0 = r28
            r19 = r1
            r25 = r9
            r9 = 2131434489(0x7f0b1bf9, float:1.8490793E38)
            r1 = r8
            r20 = r2
            r2 = r3
            r3 = r11
            r26 = r4
            r4 = r15
            r15 = r5
            r5 = r26
            r27 = r6
            r6 = r26
            r0.mo94124p(r1, r2, r3, r4, r5, r6)
            goto L_0x0429
        L_0x0418:
            r19 = r1
            r20 = r2
            r26 = r4
            r15 = r5
            r27 = r6
            r25 = r9
            r24 = r13
            r9 = 2131434489(0x7f0b1bf9, float:1.8490793E38)
            r13 = r0
        L_0x0429:
            r0 = 2131436824(0x7f0b2518, float:1.849553E38)
            android.view.View r0 = r8.findViewById(r0)
            if (r0 == 0) goto L_0x0437
            r1 = 8
            r0.setVisibility(r1)
        L_0x0437:
            if (r11 == 0) goto L_0x04a3
            com.google.protobuf.cq r1 = r11.f31790p
            int r1 = r1.size()
            if (r1 == 0) goto L_0x04a3
            com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView r0 = (com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.MetadataLineView) r0
            if (r0 == 0) goto L_0x04a3
            r1 = 0
            r0.setVisibility(r1)
            com.google.protobuf.cq r1 = r11.f31790p
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r2 = r7.f290314i
            com.google.android.apps.gsa.now.shared.ui.j r2 = r2.f290349s
            r0.mo94502d(r14, r1, r2)
            com.google.android.apps.g.d.v r1 = r7.f290310e
            int r1 = r1.f32196c
            com.google.android.apps.g.d.u r1 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r1)
            if (r1 != 0) goto L_0x045e
            com.google.android.apps.g.d.u r1 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x045e:
            com.google.android.apps.g.d.u r2 = com.google.android.apps.p489g.p494d.C9277u.TRAY_GENERIC_SMALL_SPACE
            if (r1 != r2) goto L_0x0483
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            android.content.Context r1 = r7.f290307b
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r2, r1)
            int r1 = java.lang.Math.round(r1)
            android.content.Context r3 = r7.f290307b
            float r2 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r2, r3)
            int r2 = java.lang.Math.round(r2)
            r3 = 0
            com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148873e(r0, r3, r1, r2, r3)
            goto L_0x04a3
        L_0x0483:
            r3 = 0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            android.content.Context r1 = r7.f290307b
            r2 = 1086324736(0x40c00000, float:6.0)
            float r1 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r2, r1)
            int r1 = java.lang.Math.round(r1)
            android.content.Context r4 = r7.f290307b
            float r2 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r2, r4)
            int r2 = java.lang.Math.round(r2)
            com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148873e(r0, r3, r1, r2, r3)
        L_0x04a3:
            r0 = 2131429328(0x7f0b07d0, float:1.8480326E38)
            android.view.View r0 = r8.findViewById(r0)
            if (r0 == 0) goto L_0x04b1
            r1 = 8
            r0.setVisibility(r1)
        L_0x04b1:
            if (r11 == 0) goto L_0x04cc
            com.google.protobuf.cq r1 = r11.f31791q
            int r1 = r1.size()
            if (r1 == 0) goto L_0x04cc
            com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView r0 = (com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.MetadataLineView) r0
            if (r0 == 0) goto L_0x04cc
            r1 = 0
            r0.setVisibility(r1)
            com.google.protobuf.cq r1 = r11.f31791q
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r2 = r7.f290314i
            com.google.android.apps.gsa.now.shared.ui.j r2 = r2.f290349s
            r0.mo94502d(r14, r1, r2)
        L_0x04cc:
            r0 = 2131432382(0x7f0b13be, float:1.848652E38)
            android.view.View r0 = r8.findViewById(r0)
            if (r0 == 0) goto L_0x04ea
            if (r11 == 0) goto L_0x04e5
            boolean r1 = r11.f31792r
            if (r1 == 0) goto L_0x04e5
            r1 = 0
            r0.setVisibility(r1)
            android.graphics.drawable.GradientDrawable r1 = r7.f290329x
            r0.setBackgroundDrawable(r1)
            goto L_0x04ea
        L_0x04e5:
            r1 = 8
            r0.setVisibility(r1)
        L_0x04ea:
            r1 = 2131432357(0x7f0b13a5, float:1.848647E38)
            goto L_0x0507
        L_0x04ee:
            r19 = r1
            r20 = r2
            r26 = r4
            r15 = r5
            r27 = r6
            r25 = r9
            r24 = r13
            r9 = 2131434489(0x7f0b1bf9, float:1.8490793E38)
            r13 = r0
            java.lang.String r0 = r11.f31776b
            r1 = 2131432357(0x7f0b13a5, float:1.848647E38)
            r7.mo94117k(r8, r1, r0)
        L_0x0507:
            android.view.View r0 = r8.findViewById(r9)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 != 0) goto L_0x0515
            android.view.View r0 = r8.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
        L_0x0515:
            boolean r1 = r0 instanceof com.google.android.apps.gsa.now.shared.p6421ui.WebImageView
            if (r1 == 0) goto L_0x051e
            r1 = r0
            com.google.android.apps.gsa.now.shared.ui.WebImageView r1 = (com.google.android.apps.gsa.now.shared.p6421ui.WebImageView) r1
            r7.f292376O = r1
        L_0x051e:
            if (r20 == 0) goto L_0x0565
            boolean r1 = r0 instanceof com.google.android.apps.gsa.now.shared.p6421ui.RoundedCornerWebImageView
            if (r1 == 0) goto L_0x0565
            android.content.Context r1 = r7.f290307b
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131170114(0x7f071342, float:1.7954577E38)
            int r1 = r1.getDimensionPixelSize(r2)
            android.content.Context r2 = r7.f290307b
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131170113(0x7f071341, float:1.7954575E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            r3.width = r1
            r3.height = r1
            r0.setLayoutParams(r3)
            float r1 = (float) r2
            r2 = r0
            com.google.android.apps.gsa.now.shared.ui.RoundedCornerWebImageView r2 = (com.google.android.apps.gsa.now.shared.p6421ui.RoundedCornerWebImageView) r2
            r2.mo76728d(r1, r1, r1, r1)
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END
            r0.setScaleType(r1)
            if (r13 == 0) goto L_0x05f7
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r2 = -2
            r1.width = r2
            r1.height = r2
            r13.setLayoutParams(r1)
            goto L_0x05f7
        L_0x0565:
            int r1 = r11.f31775a
            r2 = r1 & 16
            if (r2 == 0) goto L_0x056c
            goto L_0x0570
        L_0x056c:
            r2 = r1 & 8
            if (r2 == 0) goto L_0x05c7
        L_0x0570:
            if (r13 == 0) goto L_0x05c7
            int r1 = r13.getChildCount()
            if (r1 <= 0) goto L_0x057a
            r1 = 1
            goto L_0x057b
        L_0x057a:
            r1 = 0
        L_0x057b:
            int r2 = r11.f31775a
            r2 = r2 & 16
            if (r2 == 0) goto L_0x05a0
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            int r3 = r11.f31782h
            r2.height = r3
            android.view.ViewGroup$LayoutParams r2 = r13.getLayoutParams()
            int r3 = r11.f31782h
            r2.height = r3
            if (r1 == 0) goto L_0x05a0
            r2 = 0
            android.view.View r3 = r13.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            int r3 = r11.f31782h
            r2.height = r3
        L_0x05a0:
            int r2 = r11.f31775a
            r3 = 8
            r2 = r2 & r3
            if (r2 == 0) goto L_0x05f7
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            int r3 = r11.f31781g
            r2.width = r3
            android.view.ViewGroup$LayoutParams r2 = r13.getLayoutParams()
            int r3 = r11.f31781g
            r2.width = r3
            if (r1 == 0) goto L_0x05f7
            r1 = 0
            android.view.View r2 = r13.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r2 = r11.f31781g
            r1.width = r2
            goto L_0x05f7
        L_0x05c7:
            r1 = r1 & 32
            if (r1 == 0) goto L_0x05db
            if (r13 == 0) goto L_0x05db
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r2 = -2
            r1.height = r2
            r2 = -1
            r1.width = r2
            r13.setLayoutParams(r1)
            goto L_0x05f7
        L_0x05db:
            r1 = 1
            if (r12 == r1) goto L_0x05f7
            android.content.Context r1 = r7.f290307b
            android.content.res.Resources r1 = r1.getResources()
            com.google.android.apps.gsa.sidekick.shared.util.C91961al.m150918b(r1, r0, r12)
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END
            r0.setScaleType(r1)
            if (r13 == 0) goto L_0x05f7
            android.content.Context r1 = r7.f290307b
            android.content.res.Resources r1 = r1.getResources()
            com.google.android.apps.gsa.sidekick.shared.util.C91961al.m150918b(r1, r13, r12)
        L_0x05f7:
            if (r19 == 0) goto L_0x0605
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER
            r0.setScaleType(r1)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r1 = -2
            r0.height = r1
        L_0x0605:
            android.view.View r0 = r8.findViewById(r9)
            com.google.android.apps.g.d.cj r1 = r10.f31721f
            if (r1 != 0) goto L_0x060f
            com.google.android.apps.g.d.cj r1 = com.google.android.apps.p489g.p494d.C9201cj.f31773u
        L_0x060f:
            boolean r2 = r0 instanceof com.google.android.apps.gsa.now.shared.p6421ui.C83417f
            if (r2 == 0) goto L_0x063d
            com.google.android.apps.g.d.u r2 = com.google.android.apps.p489g.p494d.C9277u.HERO_IMAGE_CENTER
            r6 = r27
            if (r6 != r2) goto L_0x0621
            int r2 = r1.f31786l
            if (r2 != 0) goto L_0x0621
            int r1 = r1.f31787m
            if (r1 == 0) goto L_0x062d
        L_0x0621:
            com.google.android.apps.g.d.u r1 = com.google.android.apps.p489g.p494d.C9277u.TRAY_IMAGE_FULL
            if (r6 == r1) goto L_0x062d
            com.google.android.apps.g.d.u r1 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CAROUSEL_TWO_TONE
            if (r6 == r1) goto L_0x062d
            com.google.android.apps.g.d.u r1 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CAROUSEL
            if (r6 != r1) goto L_0x063f
        L_0x062d:
            com.google.android.apps.gsa.now.shared.ui.f r0 = (com.google.android.apps.gsa.now.shared.p6421ui.C83417f) r0
            android.content.Context r1 = r7.f290307b
            int r1 = com.google.android.apps.gsa.now.shared.p6421ui.C83413b.m132808a(r1)
            r0.mo76723hb(r1)
            r11 = 3
            r0.mo76724hc(r11)
            goto L_0x0640
        L_0x063d:
            r6 = r27
        L_0x063f:
            r11 = 3
        L_0x0640:
            r12 = 2
            goto L_0x06f1
        L_0x0643:
            r26 = r4
            r25 = r9
            r24 = r13
            r23 = r15
            r9 = 2131434489(0x7f0b1bf9, float:1.8490793E38)
            r11 = 3
            r15 = r5
            int r0 = r10.f31716a
            r1 = r0 & 4
            if (r1 == 0) goto L_0x06ab
            com.google.android.apps.gsa.now.shared.ui.RecyclerViewStub r1 = r7.f292374M
            if (r1 == 0) goto L_0x06ab
            int r0 = r10.f31732q
            int r2 = r10.f31724i
            int r2 = com.google.android.apps.p489g.p494d.C9185bu.m23683a(r2)
            if (r2 != 0) goto L_0x0666
            r12 = 2
            goto L_0x0675
        L_0x0666:
            r12 = 2
            if (r2 != r12) goto L_0x0675
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            r3 = -2
            r2.height = r3
            r2.width = r3
            r1.setLayoutParams(r2)
        L_0x0675:
            int r2 = r10.f31724i
            int r2 = com.google.android.apps.p489g.p494d.C9185bu.m23683a(r2)
            r3 = 2131626605(0x7f0e0a6d, float:1.888045E38)
            if (r2 != 0) goto L_0x0681
            goto L_0x0686
        L_0x0681:
            if (r2 != r11) goto L_0x0686
            r3 = 2131626620(0x7f0e0a7c, float:1.8880481E38)
        L_0x0686:
            r1.f227323a = r3
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r2 = r7.f290314i
            com.google.android.apps.gsa.now.shared.ui.j r2 = r2.f290349s
            r1.mo76716c(r2)
            android.view.View r1 = r1.mo76714a()
            if (r0 == 0) goto L_0x0698
            r1.setBackgroundColor(r0)
        L_0x0698:
            r0 = 2131427922(0x7f0b0252, float:1.8477474E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            int r2 = r10.f31722g
            r0.setImageResource(r2)
            r0 = 0
            r1.setVisibility(r0)
            goto L_0x06f1
        L_0x06ab:
            r12 = 2
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto L_0x06d8
            com.google.android.apps.g.d.b r0 = r10.f31723h
            if (r0 != 0) goto L_0x06b7
            com.google.android.apps.g.d.b r0 = com.google.android.apps.p489g.p494d.C9164b.f31642o
        L_0x06b7:
            r2 = r0
            com.google.android.apps.gsa.now.shared.ui.RecyclerViewStub r0 = r7.f292374M
            if (r0 != 0) goto L_0x06ca
            com.google.common.f.e r0 = f292361E
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "Layout doesn't contain a photo_stub to setup the asset"
            r2 = 22078(0x563e, float:3.0938E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            goto L_0x06f1
        L_0x06ca:
            r3 = 2131434510(0x7f0b1c0e, float:1.8490836E38)
            r4 = 2131429977(0x7f0b0a59, float:1.8481642E38)
            r5 = 1
            r0 = r28
            r1 = r8
            r0.mo94116j(r1, r2, r3, r4, r5)
            goto L_0x06f1
        L_0x06d8:
            boolean r0 = r10.f31730o
            if (r0 == 0) goto L_0x06f1
            com.google.android.apps.gsa.now.shared.ui.RecyclerViewStub r0 = r7.f292374M
            if (r0 == 0) goto L_0x06f1
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r1 = r7.f290314i
            com.google.android.apps.gsa.now.shared.ui.j r1 = r1.f290349s
            r0.mo76716c(r1)
            com.google.android.apps.gsa.now.shared.ui.RecyclerViewStub r0 = r7.f292374M
            android.view.View r0 = r0.mo76714a()
            r1 = 4
            r0.setVisibility(r1)
        L_0x06f1:
            com.google.android.apps.g.d.u r0 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CENTERED_ICON
            if (r6 != r0) goto L_0x0724
            if (r15 != 0) goto L_0x0724
            com.google.protobuf.cq r0 = r10.f31717b
            com.google.common.b.eu r0 = com.google.common.p4522b.C58431eu.m89654f(r0)
            com.google.android.apps.gsa.staticplugins.nowcards.g.at r1 = com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104922at.f292356a
            com.google.common.b.eu r0 = r0.mo55247g(r1)
            com.google.common.b.eu r0 = com.google.common.p4522b.C58431eu.m89652b(r0)
            com.google.android.apps.gsa.staticplugins.nowcards.g.au r1 = com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104923au.f292357a
            java.lang.Iterable r0 = r0.mo55248h()
            boolean r0 = com.google.common.p4522b.C58557jl.m90138s(r0, r1)
            if (r0 != 0) goto L_0x0724
            android.view.View r0 = r7.f292377P
            if (r0 == 0) goto L_0x0724
            r1 = 0
            r0.setVisibility(r1)
            android.view.View r0 = r7.f292377P
            int r1 = r28.m173941N()
            r0.setBackgroundColor(r1)
        L_0x0724:
            com.google.android.apps.g.d.u r0 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CENTERED_ICON
            r1 = 15
            if (r6 != r0) goto L_0x0757
            int r0 = r10.f31716a
            r0 = r0 & r12
            if (r0 == 0) goto L_0x0757
            android.view.View r0 = r7.f290311f
            r2 = 2131432162(0x7f0b12e2, float:1.8486074E38)
            android.view.View r0 = r0.findViewById(r2)
            r2 = 8
            r0.setVisibility(r2)
            android.view.View r0 = r8.findViewById(r9)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L_0x0757
            boolean r2 = r0 instanceof com.google.android.apps.gsa.now.shared.p6421ui.RoundedCornerWebImageView
            if (r2 == 0) goto L_0x0757
            com.google.android.apps.gsa.now.shared.ui.RoundedCornerWebImageView r0 = (com.google.android.apps.gsa.now.shared.p6421ui.RoundedCornerWebImageView) r0
            r0.mo76724hc(r1)
            android.content.Context r2 = r7.f290307b
            int r2 = com.google.android.apps.gsa.now.shared.p6421ui.C83413b.m132808a(r2)
            r0.mo76723hb(r2)
        L_0x0757:
            r0 = r25
            int r2 = r0.f32192a
            r3 = 134217728(0x8000000, float:3.85186E-34)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x08dd
            boolean r2 = r7.f292383V
            if (r2 != 0) goto L_0x08dd
            com.google.android.apps.g.d.u r2 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CAROUSEL_TEXTONLY_RADIO
            r3 = 2131626635(0x7f0e0a8b, float:1.8880512E38)
            r4 = 2131429969(0x7f0b0a51, float:1.8481626E38)
            if (r6 != r2) goto L_0x0803
            com.google.android.apps.gsa.staticplugins.nowcards.g.bn r2 = r7.f292368G
            if (r2 != 0) goto L_0x07dc
            com.google.android.apps.gsa.staticplugins.nowcards.g.bn r2 = new com.google.android.apps.gsa.staticplugins.nowcards.g.bn
            com.google.android.apps.gsa.sidekick.shared.ui.p r5 = r7.f290308c
            com.google.android.apps.gsa.sidekick.shared.monet.util.e r13 = r7.f290316k
            r2.<init>(r5, r13)
            r7.f292368G = r2
            int r5 = r0.f32179M
            boolean r13 = r2.f292422b
            if (r13 == 0) goto L_0x0784
            goto L_0x07dc
        L_0x0784:
            if (r5 <= 0) goto L_0x0792
            com.google.android.apps.gsa.sidekick.shared.ui.p r13 = r2.f292421a
            android.view.ContextThemeWrapper r13 = r13.f256405a
            android.content.res.Resources$Theme r13 = r13.getTheme()
            r14 = 1
            r13.applyStyle(r5, r14)
        L_0x0792:
            android.view.View r4 = r8.findViewById(r4)
            r2.f292425e = r4
            r4 = 2131435162(0x7f0b1e9a, float:1.8492158E38)
            android.view.View r4 = r8.findViewById(r4)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            r4.setLayoutResource(r3)
            com.google.android.apps.gsa.sidekick.shared.ui.p r3 = r2.f292421a
            android.view.LayoutInflater r3 = r3.f256406b
            r4.setLayoutInflater(r3)
            android.view.View r3 = r4.inflate()
            r2.f292424d = r3
            android.view.View r3 = r2.f292425e
            r4 = 0
            r3.setFocusableInTouchMode(r4)
            android.view.View r3 = r2.f292424d
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.setAlpha(r4)
            android.view.View r3 = r2.f292424d
            r4 = 0
            r3.setBackground(r4)
            android.view.View r3 = r2.f292424d
            com.google.android.apps.gsa.staticplugins.nowcards.g.bl r4 = new com.google.android.apps.gsa.staticplugins.nowcards.g.bl
            r4.<init>(r2)
            r3.setOnClickListener(r4)
            android.view.View r3 = r2.f292425e
            com.google.android.apps.gsa.staticplugins.nowcards.g.bm r4 = new com.google.android.apps.gsa.staticplugins.nowcards.g.bm
            r4.<init>(r2)
            r3.setOnClickListener(r4)
            r3 = 1
            r2.f292422b = r3
            goto L_0x07dd
        L_0x07dc:
            r3 = 1
        L_0x07dd:
            com.google.android.apps.gsa.staticplugins.nowcards.g.bn r2 = r7.f292368G
            com.google.ai.b.up r4 = r0.f32170D
            if (r4 != 0) goto L_0x07e5
            com.google.ai.b.up r4 = com.google.p375ai.p378b.C8075up.f28418l
        L_0x07e5:
            boolean r5 = r7.f290318m
            r2.f292423c = r4
            r2.mo94403b(r3)
            r2.mo94404c()
            android.view.View r3 = r2.f292424d
            android.widget.ImageButton r3 = (android.widget.ImageButton) r3
            if (r5 == 0) goto L_0x07fa
            com.google.ai.b.up r2 = r2.f292423c
            int r2 = r2.f28430k
            goto L_0x07fe
        L_0x07fa:
            com.google.ai.b.up r2 = r2.f292423c
            int r2 = r2.f28429j
        L_0x07fe:
            r3.setColorFilter(r2)
            goto L_0x08dd
        L_0x0803:
            com.google.android.apps.gsa.staticplugins.nowcards.g.ca r2 = r7.f292367F
            if (r2 != 0) goto L_0x08c1
            com.google.android.apps.gsa.staticplugins.nowcards.g.ca r2 = new com.google.android.apps.gsa.staticplugins.nowcards.g.ca
            com.google.android.apps.gsa.sidekick.shared.ui.p r5 = r7.f290308c
            android.content.Context r13 = r7.f290307b
            int r20 = com.google.android.apps.gsa.now.shared.p6421ui.C83413b.m132808a(r13)
            com.google.android.apps.gsa.sidekick.shared.monet.util.e r13 = r7.f290316k
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r15 = r7.f290314i
            com.google.android.apps.gsa.now.shared.ui.j r15 = r15.f290349s
            r17 = r2
            r18 = r5
            r19 = r14
            r21 = r13
            r22 = r15
            r17.<init>(r18, r19, r20, r21, r22)
            r7.f292367F = r2
            int r5 = r0.f32179M
            boolean r13 = r2.f292457o
            if (r13 == 0) goto L_0x082e
            goto L_0x08c1
        L_0x082e:
            if (r5 <= 0) goto L_0x083c
            com.google.android.apps.gsa.sidekick.shared.ui.p r13 = r2.f292443a
            android.view.ContextThemeWrapper r13 = r13.f256405a
            android.content.res.Resources$Theme r13 = r13.getTheme()
            r14 = 1
            r13.applyStyle(r5, r14)
        L_0x083c:
            r5 = 2131436630(0x7f0b2456, float:1.8495136E38)
            android.view.View r3 = r2.mo94418b(r8, r5, r3)
            r2.f292449g = r3
            android.view.View r3 = r2.f292449g
            r5 = 0
            r3.setFocusableInTouchMode(r5)
            r3 = 2131436629(0x7f0b2455, float:1.8495134E38)
            r5 = 2131626634(0x7f0e0a8a, float:1.888051E38)
            android.view.View r3 = r2.mo94418b(r8, r3, r5)
            r2.f292450h = r3
            android.view.View r3 = r2.f292450h
            r5 = 2131436628(0x7f0b2454, float:1.8495132E38)
            android.view.View r3 = r3.findViewById(r5)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r2.f292456n = r3
            android.view.View r3 = r2.f292450h
            r5 = 2131432643(0x7f0b14c3, float:1.848705E38)
            android.view.View r3 = r3.findViewById(r5)
            com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView r3 = (com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.MetadataLineView) r3
            r2.f292448f = r3
            android.view.View r3 = r2.f292450h
            r5 = 2131434234(0x7f0b1afa, float:1.8490276E38)
            android.view.View r3 = r3.findViewById(r5)
            com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView r3 = (com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.MetadataLineView) r3
            r2.f292447e = r3
            android.view.View r3 = r8.findViewById(r4)
            r2.f292451i = r3
            r3 = 2131429235(0x7f0b0773, float:1.8480137E38)
            android.view.View r3 = r8.findViewById(r3)
            r2.f292452j = r3
            android.view.View r3 = r2.f292451i
            com.google.android.apps.gsa.staticplugins.nowcards.g.bu r5 = new com.google.android.apps.gsa.staticplugins.nowcards.g.bu
            r5.<init>(r2)
            r3.setOnTouchListener(r5)
            android.view.View r3 = r2.f292451i
            android.view.View r3 = r3.findViewById(r4)
            com.google.android.apps.gsa.staticplugins.nowcards.g.bv r4 = new com.google.android.apps.gsa.staticplugins.nowcards.g.bv
            r4.<init>(r2)
            r3.setOnClickListener(r4)
            android.view.View r3 = r2.f292449g
            com.google.android.apps.gsa.staticplugins.nowcards.g.bw r4 = new com.google.android.apps.gsa.staticplugins.nowcards.g.bw
            r4.<init>(r2)
            r3.setOnClickListener(r4)
            android.view.View r3 = r2.f292450h
            r4 = 1
            r3.setClickable(r4)
            android.view.View r3 = r2.f292450h
            com.google.android.apps.gsa.staticplugins.nowcards.g.bx r5 = new com.google.android.apps.gsa.staticplugins.nowcards.g.bx
            r5.<init>(r2)
            r3.setOnClickListener(r5)
            r2.f292457o = r4
        L_0x08c1:
            com.google.android.apps.gsa.staticplugins.nowcards.g.ca r2 = r7.f292367F
            com.google.android.apps.g.d.bx r3 = r0.f32210q
            if (r3 != 0) goto L_0x08c9
            com.google.android.apps.g.d.bx r3 = com.google.android.apps.p489g.p494d.C9188bx.f31714x
        L_0x08c9:
            com.google.ai.b.up r4 = r0.f32170D
            if (r4 != 0) goto L_0x08cf
            com.google.ai.b.up r4 = com.google.p375ai.p378b.C8075up.f28418l
        L_0x08cf:
            r2.f292444b = r3
            r2.f292446d = r6
            r2.f292445c = r4
            r3 = 1
            r2.mo94421e(r3)
            r3 = 0
            r2.mo94422f(r3, r3)
        L_0x08dd:
            com.google.android.apps.g.d.u r2 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CAROUSEL_TWO_TONE
            if (r6 == r2) goto L_0x0932
            com.google.android.apps.g.d.u r2 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CAROUSEL_TWO_TONE_ICON
            if (r6 != r2) goto L_0x08e6
            goto L_0x0932
        L_0x08e6:
            com.google.android.apps.g.d.u r2 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CAROUSEL_MONOTONE
            if (r6 != r2) goto L_0x0906
            com.google.android.apps.gsa.now.shared.ui.RecyclerViewStub r2 = r7.f292374M
            if (r2 == 0) goto L_0x08f3
            r3 = 8
            r2.setVisibility(r3)
        L_0x08f3:
            android.view.View r2 = r7.f292377P
            if (r2 == 0) goto L_0x09b5
            r3 = 0
            r2.setVisibility(r3)
            android.view.View r2 = r7.f292377P
            int r3 = r28.m173941N()
            r2.setBackgroundColor(r3)
            goto L_0x09b5
        L_0x0906:
            com.google.android.apps.g.d.u r2 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CAROUSEL_WEB_LOGO
            if (r6 != r2) goto L_0x09b5
            com.google.android.apps.gsa.now.shared.ui.RecyclerViewStub r2 = r7.f292374M
            if (r2 == 0) goto L_0x09b5
            r3 = 2131429977(0x7f0b0a59, float:1.8481642E38)
            android.view.View r2 = r2.findViewById(r3)
            if (r2 == 0) goto L_0x09b5
            com.google.android.apps.gsa.sidekick.shared.ui.q r3 = new com.google.android.apps.gsa.sidekick.shared.ui.q
            com.google.android.apps.g.d.bx r4 = r0.f32210q
            if (r4 != 0) goto L_0x091f
            com.google.android.apps.g.d.bx r4 = com.google.android.apps.p489g.p494d.C9188bx.f31714x
        L_0x091f:
            int r4 = r4.f31732q
            android.content.Context r5 = r7.f290307b
            int r5 = com.google.android.apps.gsa.now.shared.p6421ui.C83413b.m132808a(r5)
            r3.<init>(r4, r5)
            r3.mo86641a(r11)
            r2.setBackground(r3)
            goto L_0x09b5
        L_0x0932:
            int r2 = r0.f32167A
            int r3 = android.graphics.Color.alpha(r2)
            int r4 = android.graphics.Color.red(r2)
            int r5 = android.graphics.Color.green(r2)
            int r2 = android.graphics.Color.blue(r2)
            double r13 = (double) r4
            r15 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            java.lang.Double.isNaN(r13)
            double r13 = r13 * r15
            int r4 = (int) r13
            double r13 = (double) r5
            java.lang.Double.isNaN(r13)
            double r13 = r13 * r15
            int r5 = (int) r13
            double r13 = (double) r2
            java.lang.Double.isNaN(r13)
            double r13 = r13 * r15
            int r2 = (int) r13
            int r2 = android.graphics.Color.argb(r3, r4, r5, r2)
            r3 = 2131436763(0x7f0b24db, float:1.8495406E38)
            android.view.View r3 = r8.findViewById(r3)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            com.google.android.apps.gsa.sidekick.shared.ui.q r2 = r7.mo94118l(r2)
            r4 = 12
            r2.mo86641a(r4)
            r7.mo94125r(r3, r2)
            com.google.android.apps.gsa.now.shared.ui.RecyclerViewStub r2 = r7.f292374M
            if (r2 == 0) goto L_0x09b5
            android.view.View r2 = r2.findViewById(r9)
            if (r2 == 0) goto L_0x09b5
            boolean r3 = r2 instanceof com.google.android.apps.gsa.now.shared.p6421ui.WebImageView
            if (r3 == 0) goto L_0x09b5
            com.google.android.apps.gsa.now.shared.ui.WebImageView r2 = (com.google.android.apps.gsa.now.shared.p6421ui.WebImageView) r2
            r7.f292376O = r2
            r3 = 1
            r2.f227361k = r3
            r2.mo76736g()
            com.google.android.apps.gsa.now.shared.ui.WebImageView r2 = r7.f292376O
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            com.google.android.apps.g.d.u r3 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CAROUSEL_TWO_TONE_ICON
            if (r6 != r3) goto L_0x09a1
            r3 = r26
            r2.height = r3
            r2.width = r3
            com.google.android.apps.gsa.now.shared.ui.WebImageView r3 = r7.f292376O
            r3.setLayoutParams(r2)
        L_0x09a1:
            com.google.android.apps.gsa.now.shared.ui.WebImageView r2 = r7.f292376O
            boolean r3 = r2 instanceof com.google.android.apps.gsa.now.shared.p6421ui.RoundedCornerWebImageView
            if (r3 == 0) goto L_0x09b5
            com.google.android.apps.gsa.now.shared.ui.RoundedCornerWebImageView r2 = (com.google.android.apps.gsa.now.shared.p6421ui.RoundedCornerWebImageView) r2
            r2.mo76724hc(r1)
            android.content.Context r3 = r7.f290307b
            int r3 = com.google.android.apps.gsa.now.shared.p6421ui.C83413b.m132808a(r3)
            r2.mo76723hb(r3)
        L_0x09b5:
            int r2 = r10.f31716a
            r2 = r2 & r12
            if (r2 == 0) goto L_0x09eb
            com.google.android.apps.gsa.now.shared.ui.RecyclerViewStub r2 = r7.f292374M
            if (r2 == 0) goto L_0x09eb
            com.google.android.apps.g.d.u r3 = com.google.android.apps.p489g.p494d.C9277u.TRAY_GENERIC_SMALL_SPACE
            if (r6 == r3) goto L_0x09ce
            com.google.android.apps.g.d.u r3 = com.google.android.apps.p489g.p494d.C9277u.TRAY_GENERIC_LARGE_SPACE
            if (r6 == r3) goto L_0x09ce
            com.google.android.apps.g.d.u r3 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_RIGHT
            if (r6 == r3) goto L_0x09ce
            com.google.android.apps.g.d.u r3 = com.google.android.apps.p489g.p494d.C9277u.HERO_IMAGE_RIGHT
            if (r6 != r3) goto L_0x09eb
        L_0x09ce:
            android.view.View r2 = r2.findViewById(r9)
            boolean r3 = r2 instanceof com.google.android.apps.gsa.now.shared.p6421ui.RoundedCornerWebImageView
            if (r3 == 0) goto L_0x09eb
            com.google.android.apps.gsa.now.shared.ui.RoundedCornerWebImageView r2 = (com.google.android.apps.gsa.now.shared.p6421ui.RoundedCornerWebImageView) r2
            r2.mo76724hc(r1)
            android.content.Context r1 = r7.f290307b
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131168025(0x7f070b19, float:1.795034E38)
            int r1 = r1.getDimensionPixelSize(r3)
            r2.mo76723hb(r1)
        L_0x09eb:
            com.google.android.apps.g.d.u r1 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SUGGESTION_CHIPS_LIST_ROW
            if (r6 != r1) goto L_0x0a22
            android.content.Context r1 = r7.f290307b
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131169019(0x7f070efb, float:1.7952356E38)
            int r1 = r1.getDimensionPixelSize(r2)
            if (r24 == 0) goto L_0x0a13
            android.content.Context r1 = r7.f290307b
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131169610(0x7f07114a, float:1.7953555E38)
            int r1 = r1.getDimensionPixelSize(r2)
            int r15 = r23 - r1
            r1 = 0
            int r2 = java.lang.Math.max(r15, r1)
            r1 = r2
        L_0x0a13:
            int r2 = r8.getPaddingLeft()
            int r3 = r8.getPaddingRight()
            int r4 = r8.getPaddingBottom()
            r8.setPadding(r2, r1, r3, r4)
        L_0x0a22:
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r1 = r7.f290314i
            boolean r1 = r1.f290335e
            if (r1 == 0) goto L_0x0a2b
            r28.mo94398M()
        L_0x0a2b:
            com.google.protobuf.cq r1 = r0.f32191Y
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0a34
            goto L_0x0a76
        L_0x0a34:
            java.util.List r1 = r7.f292381T
            java.util.Iterator r1 = r1.iterator()
            com.google.protobuf.cq r0 = r0.f32191Y
            java.util.Iterator r0 = r0.iterator()
        L_0x0a40:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0a76
            java.lang.Object r2 = r0.next()
            com.google.android.apps.g.d.dt r2 = (com.google.android.apps.p489g.p494d.C9238dt) r2
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0a76
            java.lang.Object r3 = r1.next()
            android.view.View r3 = (android.view.View) r3
            r4 = 2131429697(0x7f0b0941, float:1.8481074E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x0a68
            java.lang.String r5 = r2.f31939b
            r4.setText(r5)
        L_0x0a68:
            com.google.android.apps.g.d.ad r2 = r2.f31940c
            if (r2 != 0) goto L_0x0a6e
            com.google.android.apps.g.d.ad r2 = com.google.android.apps.p489g.p494d.C9141ad.f31521K
        L_0x0a6e:
            r7.mo94103B(r3, r2)
            r2 = 0
            r3.setVisibility(r2)
            goto L_0x0a40
        L_0x0a76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104928az.mo94020e():void");
    }

    public final void onViewAttachedToWindow(View view) {
        C9277u a = C9277u.m23705a(this.f290310e.f32196c);
        if (a == null) {
            a = C9277u.UNKNOWN;
        }
        if (a == C9277u.METADATA_CARD_ASSISTANT_HQ_EMPTY_CLUSTER) {
            ViewParent parent = this.f290311f.getParent();
            if (parent instanceof ModularCard) {
                ModularCard modularCard = (ModularCard) parent;
                modularCard.mo4475e(0.0f);
                modularCard.mo4474d(0.0f);
                modularCard.mo4473c(modularCard.getResources().getColor(17170445));
            }
        }
        C9277u a2 = C9277u.m23705a(this.f290310e.f32196c);
        if (a2 == null) {
            a2 = C9277u.UNKNOWN;
        }
        if (a2 == C9277u.HERO_IMAGE_CENTER) {
            mo94398M();
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        C9277u a = C9277u.m23705a(this.f290310e.f32196c);
        if (a == null) {
            a = C9277u.UNKNOWN;
        }
        if (a == C9277u.HERO_IMAGE_CENTER) {
            m173942O();
        }
    }

    /* renamed from: q */
    public final void mo94036q() {
        RecyclerViewStub recyclerViewStub;
        RecyclerViewStub recyclerViewStub2;
        super.mo94036q();
        View view = this.f290311f;
        if (view != null) {
            view.setAccessibilityDelegate((View.AccessibilityDelegate) null);
        }
        MetadataLineView metadataLineView = this.f292385z;
        if (metadataLineView != null) {
            metadataLineView.mo94501c();
            this.f292385z.setAccessibilityDelegate((View.AccessibilityDelegate) null);
            this.f292385z.setImportantForAccessibility(0);
        }
        MetadataLineView metadataLineView2 = this.f292364B;
        if (metadataLineView2 != null) {
            metadataLineView2.mo94501c();
        }
        MetadataLineView metadataLineView3 = this.f292365C;
        if (metadataLineView3 != null) {
            metadataLineView3.mo94501c();
        }
        MetadataLineView metadataLineView4 = this.f292366D;
        if (metadataLineView4 != null) {
            metadataLineView4.mo94501c();
        }
        MetadataLineView metadataLineView5 = this.f292363A;
        if (metadataLineView5 != null) {
            metadataLineView5.mo94501c();
        }
        if (this.f292376O == null && (recyclerViewStub = this.f292374M) != null) {
            WebImageView webImageView = (WebImageView) recyclerViewStub.findViewById(R.id.photo);
            this.f292376O = webImageView;
            if (webImageView == null && (recyclerViewStub2 = this.f292374M) != null) {
                this.f292376O = (WebImageView) recyclerViewStub2.findViewById(R.id.image);
            }
        }
        WebImageView webImageView2 = this.f292376O;
        if (webImageView2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) webImageView2.getLayoutParams();
            marginLayoutParams.height = -1;
            marginLayoutParams.width = -1;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            this.f292376O.setLayoutParams(marginLayoutParams);
        }
        RecyclerViewStub recyclerViewStub3 = this.f292374M;
        if (recyclerViewStub3 != null) {
            recyclerViewStub3.f227323a = this.f292382U;
            recyclerViewStub3.mo76715b();
            this.f292374M.setVisibility(8);
        }
        RecyclerViewStub recyclerViewStub4 = this.f292375N;
        if (recyclerViewStub4 != null) {
            recyclerViewStub4.mo76715b();
        }
        C104957ca caVar = this.f292367F;
        if (caVar != null) {
            caVar.mo94421e(false);
            caVar.f292455m = null;
        }
        C104943bn bnVar = this.f292368G;
        if (bnVar != null) {
            bnVar.mo94403b(false);
            bnVar.f292426f = null;
        }
        for (View view2 : this.f292381T) {
            view2.setOnClickListener((View.OnClickListener) null);
            view2.setVisibility(8);
        }
        LinearLayout linearLayout = this.f292373L;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        View view3 = this.f292372K;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        m173942O();
    }

    /* renamed from: s */
    public final void mo94126s(C9278v vVar) {
        super.mo94126s(vVar);
        if (vVar.f32179M != 0) {
            this.f290308c.f256405a.getTheme().applyStyle(this.f290310e.f32179M, true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo94128v(C9277u uVar, View view) {
        if (uVar == C9277u.METADATA_CARD_SMALL_CAROUSEL || uVar == C9277u.HERO_IMAGE_CENTER) {
            view.setBackground(this.f290307b.getResources().getDrawable(R.drawable.ic_play_shadow_56));
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int dimensionPixelSize = this.f290307b.getResources().getDimensionPixelSize(R.dimen.media_icon_large_size);
            layoutParams.height = dimensionPixelSize;
            layoutParams.width = dimensionPixelSize;
            return;
        }
        view.setBackground(this.f290307b.getResources().getDrawable(R.drawable.ic_play_shadow_40));
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int dimensionPixelSize2 = this.f290307b.getResources().getDimensionPixelSize(R.dimen.media_icon_small_size);
        layoutParams2.height = dimensionPixelSize2;
        layoutParams2.width = dimensionPixelSize2;
    }
}
