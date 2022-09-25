package com.google.android.apps.gsa.staticplugins.opa.inproducthelp;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p031v4.app.C0167am;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.C90779c;
import com.google.android.apps.gsa.staticplugins.opa.C108516cw;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.util.C113863cr;
import com.google.android.apps.gsa.staticplugins.opa.util.C113869cx;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.material.featurehighlight.C28509a;
import com.google.android.libraries.material.featurehighlight.ViewFinder;
import com.google.assistant.p3897e.p3921j.C52323nm;
import com.google.assistant.p3897e.p3921j.C52324nn;
import com.google.assistant.p3897e.p3921j.C52325no;
import com.google.assistant.p3897e.p3921j.C52327nq;
import com.google.assistant.p3897e.p3921j.C52329ns;
import com.google.assistant.p3897e.p3921j.C52332nv;
import com.google.assistant.p3897e.p3921j.C52333nw;
import com.google.assistant.p3897e.p3921j.C52334nx;
import com.google.assistant.p3897e.p3921j.C52336nz;
import com.google.assistant.p3897e.p3921j.C52339ob;
import com.google.assistant.p3897e.p3921j.C52340oc;
import com.google.assistant.p3897e.p3921j.C52341od;
import com.google.assistant.p3897e.p3921j.C52343of;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public final class ChatUiHelpController {

    /* renamed from: a */
    public final C0167am f304440a;

    /* renamed from: b */
    public final SharedPreferences f304441b;

    /* renamed from: c */
    public final C113863cr f304442c;

    /* renamed from: d */
    public final C107698i f304443d;

    /* renamed from: e */
    public final C52341od f304444e;

    /* renamed from: f */
    public final C113869cx f304445f;

    /* renamed from: g */
    public final List f304446g = new ArrayList();

    /* renamed from: h */
    public final Map f304447h = new HashMap();

    /* renamed from: i */
    public C52340oc f304448i;

    /* renamed from: j */
    public boolean f304449j = false;

    /* renamed from: k */
    public int f304450k = 0;

    /* renamed from: l */
    public boolean f304451l = false;

    /* renamed from: m */
    public long f304452m;

    /* renamed from: n */
    public long f304453n;

    /* renamed from: o */
    private final boolean f304454o;

    /* renamed from: p */
    private long f304455p = -1;

    /* renamed from: q */
    private int f304456q;

    /* renamed from: r */
    private final C108516cw f304457r;

    /* compiled from: PG */
    class ChatUiViewFinder extends ViewFinder {
        public static final Parcelable.Creator CREATOR = new C109290a();

        /* renamed from: a */
        public View mo33963a(Activity activity, View view) {
            return null;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
        }
    }

    public ChatUiHelpController(C58833ax axVar, C0167am amVar, SharedPreferences sharedPreferences, C113863cr crVar, C107698i iVar, C113869cx cxVar, C108516cw cwVar, C52340oc ocVar) {
        C52325no noVar;
        this.f304454o = axVar.mo56113h();
        this.f304440a = amVar;
        this.f304441b = sharedPreferences;
        this.f304442c = crVar;
        this.f304443d = iVar;
        this.f304445f = cxVar;
        this.f304457r = cwVar;
        this.f304448i = ocVar;
        this.f304444e = (C52341od) C52343of.f137384i.createBuilder();
        Set a = mo97745a();
        for (C52334nx nxVar : this.f304448i.f137373b) {
            Map map = this.f304447h;
            int b = C52336nz.m86575b(nxVar.f137359e);
            map.put(C52336nz.m86574a(b == 0 ? 1 : b), Integer.valueOf(nxVar.f137361g));
            if (!this.f304448i.f137377f) {
                int b2 = C52336nz.m86575b(nxVar.f137359e);
                if (a.contains(C52336nz.m86574a(b2 == 0 ? 1 : b2))) {
                }
            }
            int i = nxVar.f137359e;
            int b3 = C52336nz.m86575b(i);
            if (b3 == 0 || b3 != 5 || this.f304454o) {
                int b4 = C52336nz.m86575b(i);
                if (b4 != 0 && b4 == 9) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    this.f304440a.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                    View findViewById = this.f304440a.findViewById(R.id.opa_top_level);
                    if (findViewById == null) {
                        noVar = null;
                    } else {
                        int i2 = displayMetrics.widthPixels / 2;
                        findViewById.measure(0, 0);
                        int height = findViewById.getHeight();
                        int i3 = (int) (displayMetrics.density * 15.0f);
                        C52324nn nnVar = (C52324nn) C52325no.f137338g.createBuilder();
                        nnVar.copyOnWrite();
                        C52325no noVar2 = (C52325no) nnVar.instance;
                        noVar2.f137340a = 1 | noVar2.f137340a;
                        noVar2.f137341b = i2 - i3;
                        nnVar.copyOnWrite();
                        C52325no noVar3 = (C52325no) nnVar.instance;
                        noVar3.f137340a |= 4;
                        noVar3.f137343d = i2 + i3;
                        nnVar.copyOnWrite();
                        C52325no noVar4 = (C52325no) nnVar.instance;
                        noVar4.f137340a = 2 | noVar4.f137340a;
                        noVar4.f137342c = height - 2;
                        nnVar.copyOnWrite();
                        C52325no noVar5 = (C52325no) nnVar.instance;
                        noVar5.f137340a |= 8;
                        noVar5.f137344e = height - 1;
                        noVar = (C52325no) nnVar.build();
                    }
                    if (noVar != null) {
                        C52333nw nwVar = (C52333nw) nxVar.toBuilder();
                        nwVar.copyOnWrite();
                        C52334nx nxVar2 = (C52334nx) nwVar.instance;
                        nxVar2.f137358d = noVar;
                        nxVar2.f137357c = 6;
                        nxVar = (C52334nx) nwVar.build();
                    }
                }
                this.f304446g.add(nxVar);
            }
        }
        int a2 = C52323nm.m86571a(this.f304448i.f137374c);
        if (a2 != 0 && a2 == 3) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            C62910ar arVar = this.f304448i.f137375d;
            long millis = timeUnit.toMillis((arVar == null ? C62910ar.f169858c : arVar).f169860a);
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            C62910ar arVar2 = this.f304448i.f137375d;
            this.f304455p = millis + timeUnit2.toMillis((long) (arVar2 == null ? C62910ar.f169858c : arVar2).f169861b);
        }
        this.f304441b.edit().putInt("chat_ui_help_num_times_triggered", this.f304441b.getInt("chat_ui_help_num_times_triggered", 0) + 1).apply();
        C52341od odVar = this.f304444e;
        C63088z zVar = this.f304448i.f137378g;
        odVar.copyOnWrite();
        C52343of ofVar = (C52343of) odVar.instance;
        zVar.getClass();
        ofVar.f137386a |= 1;
        ofVar.f137387b = zVar;
        int a3 = C52339ob.m86576a(this.f304448i.f137379h);
        if (a3 != 0 && a3 == 2) {
            this.f304441b.edit().putInt("ww_chat_ui_help_num_times_triggered", this.f304441b.getInt("ww_chat_ui_help_num_times_triggered", 0) + 1).apply();
        }
    }

    /* renamed from: a */
    public final Set mo97745a() {
        Set<String> stringSet = this.f304441b.getStringSet("chat_ui_help_promos_shown", (Set) null);
        return stringSet == null ? new HashSet() : new HashSet(stringSet);
    }

    /* renamed from: b */
    public final void mo97746b() {
        if (this.f304449j) {
            this.f304456q = this.f304440a.getRequestedOrientation();
            C90779c.m148334a(this.f304440a, 1);
        }
    }

    /* renamed from: c */
    public final void mo97747c() {
        if (this.f304449j) {
            C90779c.m148334a(this.f304440a, this.f304456q);
        }
    }

    /* renamed from: d */
    public final boolean mo97748d() {
        String str;
        int i = 1;
        boolean z = this.f304450k < this.f304446g.size();
        if (z) {
            C52334nx nxVar = (C52334nx) this.f304446g.get(this.f304450k);
            if (nxVar != null) {
                int b = C52336nz.m86575b(nxVar.f137359e);
                if (b == 0) {
                    b = 1;
                }
                int i2 = nxVar.f137357c;
                ViewFinder viewFinder = null;
                if (i2 == 6) {
                    final C52325no noVar = (C52325no) nxVar.f137358d;
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    this.f304440a.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                    if (new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels).contains(new Rect(noVar.f137341b, noVar.f137342c, noVar.f137343d, noVar.f137344e))) {
                        viewFinder = new ChatUiViewFinder() {
                            /* renamed from: a */
                            public final View mo33963a(Activity activity, View view) {
                                ChatUiHelpController chatUiHelpController = ChatUiHelpController.this;
                                C52325no noVar = noVar;
                                FrameLayout frameLayout = (FrameLayout) chatUiHelpController.f304440a.findViewById(R.id.opa_main_view_inner);
                                if (frameLayout.findViewById(R.id.hardware_highlight_anchor_layout) == null) {
                                    RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(chatUiHelpController.f304440a.getApplicationContext()).inflate(R.layout.hardware_highlight_anchor, (ViewGroup) null);
                                    View findViewById = relativeLayout.findViewById(R.id.hardware_highlight_anchor_view);
                                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(noVar.f137343d - noVar.f137341b, noVar.f137344e - noVar.f137342c);
                                    layoutParams.leftMargin = noVar.f137341b;
                                    layoutParams.topMargin = noVar.f137342c;
                                    findViewById.setLayoutParams(layoutParams);
                                    if ((noVar.f137340a & 16) != 0) {
                                        findViewById.setBackgroundColor(noVar.f137345f);
                                    }
                                    frameLayout.addView(relativeLayout, new FrameLayout.LayoutParams(-1, -1));
                                }
                                return activity.findViewById(R.id.hardware_highlight_anchor_view);
                            }
                        };
                    }
                } else if (i2 == 5) {
                    C52329ns nsVar = (C52329ns) nxVar.f137358d;
                    Resources resources = this.f304440a.getResources();
                    String str2 = nsVar.f137349a;
                    int a = C52327nq.m86572a(nsVar.f137350b);
                    if (a == 0) {
                        a = 1;
                    }
                    final int identifier = resources.getIdentifier(str2, "id", a + -1 != 2 ? this.f304440a.getPackageName() : "android");
                    if (this.f304440a.findViewById(identifier) != null) {
                        viewFinder = new ChatUiViewFinder() {
                            /* renamed from: a */
                            public final View mo33963a(Activity activity, View view) {
                                return activity.findViewById(identifier);
                            }
                        };
                    }
                }
                if (viewFinder == null) {
                    mo97749e();
                } else {
                    C28509a aVar = new C28509a(viewFinder);
                    aVar.f77363a = nxVar.f137355a == 2 ? (String) nxVar.f137356b : BuildConfig.FLAVOR;
                    aVar.f77384v = nxVar.f137360f;
                    aVar.f77379q = C52336nz.m86574a(b);
                    C52340oc ocVar = this.f304448i;
                    int a2 = C52323nm.m86571a(ocVar.f137374c);
                    if ((a2 != 0 && a2 == 3) || (this.f304451l && b == 2)) {
                        aVar.f77382t = this.f304455p;
                    }
                    int i3 = ocVar.f137372a;
                    if (!((i3 & 256) == 0 && (i3 & 512) == 0)) {
                        if (this.f304450k == this.f304446g.size() - 1) {
                            str = this.f304448i.f137381j;
                        } else {
                            str = this.f304448i.f137380i;
                        }
                        if (!C58837ba.m90859h(str)) {
                            aVar.f77371i = str;
                            aVar.f77375m = 0;
                            i = 0;
                        }
                    }
                    aVar.f77366d = i;
                    aVar.mo33993b().mo34065a(this.f304440a);
                    C52341od odVar = this.f304444e;
                    odVar.copyOnWrite();
                    C52343of ofVar = (C52343of) odVar.instance;
                    C52343of ofVar2 = C52343of.f137384i;
                    C62971cq cqVar = ofVar.f137389d;
                    if (!cqVar.mo58948c()) {
                        ofVar.f137389d = C62942bv.mutableCopy(cqVar);
                    }
                    ofVar.f137389d.add(nxVar);
                }
            }
        } else {
            mo97750f(2);
        }
        return z;
    }

    /* renamed from: e */
    public final void mo97749e() {
        this.f304450k++;
        mo97748d();
    }

    /* renamed from: f */
    public final void mo97750f(int i) {
        View findViewById;
        View findViewById2 = this.f304440a.findViewById(R.id.opa_top_level);
        if (!(findViewById2 == null || (findViewById = findViewById2.findViewById(R.id.hardware_highlight_anchor_layout)) == null)) {
            ((FrameLayout) findViewById2.findViewById(R.id.opa_main_view_inner)).removeView(findViewById);
        }
        mo97747c();
        C52341od odVar = this.f304444e;
        odVar.copyOnWrite();
        C52343of ofVar = (C52343of) odVar.instance;
        int i2 = i - 1;
        C52343of ofVar2 = C52343of.f137384i;
        ofVar.f137388c = i2;
        ofVar.f137386a |= 2;
        boolean z = true;
        if (i == 2) {
            this.f304441b.edit().putInt("chat_ui_help_num_times_completed", this.f304441b.getInt("chat_ui_help_num_times_completed", 0) + 1).apply();
            int a = C52339ob.m86576a(this.f304448i.f137379h);
            if (a != 0 && a == 2) {
                this.f304441b.edit().putInt("ww_chat_ui_help_num_times_completed", this.f304441b.getInt("ww_chat_ui_help_num_times_completed", 0) + 1).apply();
            }
        }
        if (i2 == 1) {
            int a2 = C52332nv.m86573a(this.f304448i.f137382k);
            if (a2 == 0) {
                a2 = 1;
            }
            C108516cw cwVar = this.f304457r;
            if (a2 == 1 || a2 == 2) {
                z = false;
            }
            cwVar.mo96955a(z);
        } else if (this.f304449j) {
            this.f304457r.mo96955a(false);
        }
        this.f304449j = false;
    }
}
