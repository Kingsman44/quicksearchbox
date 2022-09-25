package com.google.android.apps.gsa.staticplugins.searchwidget;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RemoteViews;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p6995aq.C89258ab;
import com.google.android.apps.gsa.shared.p6995aq.C89272o;
import com.google.android.apps.gsa.shared.p6995aq.C89278u;
import com.google.android.apps.gsa.shared.p6995aq.C89280w;
import com.google.android.apps.gsa.shared.p6995aq.C89283z;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58701ou;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59687cb;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.x */
/* compiled from: PG */
public final class C117293x {

    /* renamed from: c */
    private static final C59071e f325589c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.searchwidget.x");

    /* renamed from: a */
    public final C84474e f325590a;

    /* renamed from: b */
    final Map f325591b = new HashMap();

    /* renamed from: d */
    private final Context f325592d;

    /* renamed from: e */
    private final C68214a f325593e;

    /* renamed from: f */
    private final C86124t f325594f;

    /* renamed from: g */
    private final C68214a f325595g;

    public C117293x(Context context, C68214a aVar, C86124t tVar, C68214a aVar2, C84474e eVar) {
        this.f325592d = context;
        this.f325593e = aVar;
        this.f325594f = tVar;
        this.f325595g = aVar2;
        this.f325590a = eVar;
    }

    /* renamed from: b */
    public static int m194927b(C89283z zVar) {
        int a = C89272o.m145215a(zVar.f242083i);
        return ((a == 0 || a == 1) && (zVar.f242075a & 65536) == 0) ? R.id.search_widget_voice_hint : R.id.search_widget_voice_hint_customization;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo103239a(int i, C89283z zVar, String str, int i2) {
        int a;
        int i3 = 0;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            View inflate = LayoutInflater.from(this.f325592d).inflate(i, (ViewGroup) null);
            View findViewById = inflate.findViewById(R.id.search_widget_super_g);
            View findViewById2 = inflate.findViewById(R.id.search_widget_google_full);
            if (findViewById != null) {
                findViewById.setVisibility(8);
                findViewById2.setVisibility(8);
                int i4 = zVar.f242078d;
                int a2 = C89280w.m145217a(i4);
                if ((a2 != 0 && a2 == 2) || ((a = C89280w.m145217a(i4)) != 0 && a == 3)) {
                    findViewById.setVisibility(0);
                } else {
                    int a3 = C89280w.m145217a(i4);
                    if (a3 == 0 || a3 == 1) {
                        findViewById2.setVisibility(0);
                    }
                }
                if ((zVar.f242075a & 8192) != 0) {
                    C89278u uVar = zVar.f242082h;
                    if (uVar == null) {
                        uVar = C89278u.f242057g;
                    }
                    View findViewById3 = inflate.findViewById(R.id.search_widget_dynamic_icon_container);
                    if (findViewById3 != null) {
                        inflate.findViewById(R.id.search_widget_voice_btn).setVisibility(8);
                        findViewById3.setVisibility(0);
                        if ((uVar.f242059a & 2) != 0) {
                            findViewById3.findViewById(R.id.search_widget_dynamic_right_icon).setVisibility(0);
                        }
                        if ((uVar.f242059a & 1) != 0) {
                            findViewById3.findViewById(R.id.search_widget_dynamic_left_icon).setVisibility(0);
                        }
                        if (uVar.f242062d) {
                            findViewById3.findViewById(R.id.search_widget_dynamic_left_divider).setVisibility(0);
                        }
                        if (uVar.f242063e) {
                            findViewById3.findViewById(R.id.search_widget_dynamic_middle_divider).setVisibility(0);
                        }
                    }
                }
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) inflate.getLayoutParams();
            TextView textView = (TextView) inflate.findViewById(i2);
            FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.search_edit_frame);
            if (textView == null || frameLayout == null) {
                return Integer.MAX_VALUE;
            }
            TextPaint paint = textView.getPaint();
            float f = this.f325592d.getResources().getDisplayMetrics().density;
            inflate.measure(0, 0);
            if (layoutParams != null) {
                i3 = layoutParams.leftMargin + layoutParams.rightMargin;
            }
            return (int) (((float) ((((((int) Math.floor((double) paint.measureText(str))) + textView.getPaddingRight()) + textView.getPaddingLeft()) + (inflate.getMeasuredWidth() - frameLayout.getMeasuredWidth())) + i3)) / f);
        } catch (Resources.NotFoundException | InflateException e) {
            ((C59052c) ((C59052c) ((C59052c) f325589c.mo56225c()).mo56382g(e)).mo56372aa(32690)).mo56386p("Failed to inflate ghost widget");
            return Integer.MAX_VALUE;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final List mo103240c() {
        String string = ((SharedPreferences) this.f325593e.mo27525b()).getString("search_widget_current_alternative_hint_list", BuildConfig.FLAVOR);
        if (TextUtils.isEmpty(string)) {
            return C58485gu.m89845m();
        }
        return Arrays.asList(string.split(";"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final List mo103241d() {
        String string = ((SharedPreferences) this.f325593e.mo27525b()).getString("search_widget_current_hint_list", BuildConfig.FLAVOR);
        if (TextUtils.isEmpty(string)) {
            return C58485gu.m89845m();
        }
        return Arrays.asList(string.split(";"));
    }

    /* renamed from: e */
    public final List mo103242e(List list, int i, int i2, C89283z zVar, int i3) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (mo103247j(i, zVar, i2, str, i3)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final void mo103243f(C89849ae aeVar, C59687cb cbVar) {
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        fVar.f246203c = cbVar;
        ((C89859i) this.f325595g.mo27525b()).mo74236a(fVar.mo83699a());
    }

    /* renamed from: g */
    public final void mo103244g(int i, C89258ab abVar) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f325593e.mo27525b();
        HashSet hashSet = new HashSet(sharedPreferences.getStringSet("search_widgets_with_big_hint_ids", C58733pz.f156496a));
        HashSet hashSet2 = new HashSet(sharedPreferences.getStringSet("search_widgets_with_small_hint_ids", C58733pz.f156496a));
        HashSet hashSet3 = new HashSet(sharedPreferences.getStringSet("search_widgets_with_hidden_hint_ids", C58733pz.f156496a));
        String valueOf = String.valueOf(i);
        C89258ab abVar2 = C89258ab.UNKNOWN;
        int ordinal = abVar.ordinal();
        if (ordinal == 1) {
            hashSet.remove(valueOf);
            hashSet2.remove(valueOf);
            hashSet3.remove(valueOf);
        } else if (ordinal == 2) {
            hashSet.remove(valueOf);
            hashSet2.remove(valueOf);
            hashSet3.add(valueOf);
        } else if (ordinal == 3) {
            hashSet.remove(valueOf);
            hashSet3.remove(valueOf);
            hashSet2.add(valueOf);
        } else if (ordinal == 4) {
            hashSet2.remove(valueOf);
            hashSet3.remove(valueOf);
            hashSet.add(valueOf);
        }
        sharedPreferences.edit().putStringSet("search_widgets_with_big_hint_ids", hashSet).putStringSet("search_widgets_with_small_hint_ids", hashSet2).putStringSet("search_widgets_with_hidden_hint_ids", hashSet3).apply();
    }

    /* renamed from: h */
    public final void mo103245h(RemoteViews remoteViews, int i, CharSequence charSequence) {
        remoteViews.setViewVisibility(R.id.search_widget_voice_hint, 8);
        remoteViews.setViewVisibility(R.id.search_widget_voice_hint_customization, 8);
        if (!TextUtils.isEmpty(charSequence) && !this.f325594f.mo79746e(C89985ax.f246663Q)) {
            remoteViews.setViewVisibility(i, 0);
            remoteViews.setTextViewText(i, charSequence);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103246i(java.lang.String r11, android.widget.RemoteViews r12, int r13, java.util.List r14) {
        /*
            r10 = this;
            r0 = 2131432244(0x7f0b1334, float:1.848624E38)
            r12.removeAllViews(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String r2 = "setFlipInterval"
            r12.setInt(r0, r2, r1)
            com.google.android.apps.gsa.search.core.ag.a.e r1 = r10.f325590a
            java.lang.String r1 = r1.mo78121j()
            int r3 = r1.hashCode()
            r4 = 99
            r5 = 0
            r6 = 1
            if (r3 == r4) goto L_0x002d
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 == r4) goto L_0x0023
            goto L_0x0037
        L_0x0023:
            java.lang.String r3 = "l"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0037
            r1 = 0
            goto L_0x0038
        L_0x002d:
            java.lang.String r3 = "c"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0037
            r1 = 1
            goto L_0x0038
        L_0x0037:
            r1 = -1
        L_0x0038:
            if (r1 == 0) goto L_0x0043
            if (r1 == r6) goto L_0x0040
            r1 = 8388629(0x800015, float:1.1754973E-38)
            goto L_0x0046
        L_0x0040:
            r1 = 17
            goto L_0x0046
        L_0x0043:
            r1 = 8388627(0x800013, float:1.175497E-38)
        L_0x0046:
            java.util.Iterator r14 = r14.iterator()
            r3 = 0
        L_0x004b:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto L_0x0091
            java.lang.Object r4 = r14.next()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            android.widget.RemoteViews r7 = new android.widget.RemoteViews
            r8 = 2131626783(0x7f0e0b1f, float:1.8880812E38)
            r7.<init>(r11, r8)
            r8 = 2131435649(0x7f0b2081, float:1.8493146E38)
            r9 = 8
            r7.setViewVisibility(r8, r9)
            r8 = 2131435650(0x7f0b2082, float:1.8493148E38)
            r7.setViewVisibility(r8, r9)
            r8 = 2131432245(0x7f0b1335, float:1.8486242E38)
            java.lang.String r9 = "setGravity"
            r7.setInt(r8, r9, r1)
            boolean r8 = android.text.TextUtils.isEmpty(r4)
            if (r8 != 0) goto L_0x004b
            com.google.android.apps.gsa.search.core.i.t r8 = r10.f325594f
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C89985ax.f246663Q
            boolean r8 = r8.mo79746e(r9)
            if (r8 != 0) goto L_0x004b
            r7.setViewVisibility(r13, r5)
            r7.setTextViewText(r13, r4)
            r12.addView(r0, r7)
            int r3 = r3 + 1
            goto L_0x004b
        L_0x0091:
            if (r3 <= r6) goto L_0x009f
            com.google.android.apps.gsa.search.core.i.t r11 = r10.f325594f
            com.google.android.apps.gsa.shared.m.f r13 = com.google.android.apps.gsa.shared.p7066m.C89985ax.f246662P
            long r13 = r11.mo79743a(r13)
            int r11 = (int) r13
            r12.setInt(r0, r2, r11)
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.searchwidget.C117293x.mo103246i(java.lang.String, android.widget.RemoteViews, int, java.util.List):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo103247j(int i, C89283z zVar, int i2, String str, int i3) {
        int i4;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f325591b.get(str);
        if (sparseIntArray == null) {
            sparseIntArray = new SparseIntArray();
            this.f325591b.put(str, sparseIntArray);
        }
        if (sparseIntArray.indexOfKey(i) < 0) {
            i4 = mo103239a(i, zVar, str, i3);
            sparseIntArray.put(i, i4);
        } else {
            i4 = sparseIntArray.get(i);
        }
        return i2 >= i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo103248k(List list, List list2) {
        if (list.size() == 1 && TextUtils.isEmpty((CharSequence) C58557jl.m90130k(list, BuildConfig.FLAVOR))) {
            list = C58485gu.m89845m();
        }
        if (list2.size() == 1 && TextUtils.isEmpty((CharSequence) C58557jl.m90130k(list2, BuildConfig.FLAVOR))) {
            list2 = C58485gu.m89845m();
        }
        C58701ou ouVar = C58701ou.f156429a;
        C58485gu F = C58485gu.m89836F(ouVar, list);
        C58485gu F2 = C58485gu.m89836F(ouVar, list2);
        C58485gu F3 = C58485gu.m89836F(ouVar, mo103241d());
        C58485gu F4 = C58485gu.m89836F(ouVar, mo103240c());
        if (C58597ky.m90218i(F3, F) && C58597ky.m90218i(F4, F2)) {
            return false;
        }
        this.f325591b.clear();
        ((SharedPreferences) this.f325593e.mo27525b()).edit().putString("search_widget_current_hint_list", new C58827ar(";").mo56097d(list)).putString("search_widget_current_alternative_hint_list", new C58827ar(";").mo56097d(list2)).remove("search_widgets_with_big_hint_ids").remove("search_widgets_with_small_hint_ids").remove("search_widgets_with_hidden_hint_ids").apply();
        return true;
    }

    public final String toString() {
        return String.format("HintController [minWidthRequirementDp='%s', hintText='%s', alternativeHintText='%s']", new Object[]{this.f325591b.toString(), mo103241d(), mo103240c()});
    }
}
