package androidx.media3.extractor.p163j.p169f;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import androidx.media3.common.p135a.C2566b;
import androidx.media3.common.p135a.C2569e;
import androidx.media3.common.p135a.C2571g;
import androidx.media3.common.p135a.C2572h;
import androidx.media3.common.p135a.C2573i;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2633u;
import com.evernote.android.state.BuildConfig;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: androidx.media3.extractor.j.f.g */
/* compiled from: PG */
final class C3503g {

    /* renamed from: a */
    public final String f10909a;

    /* renamed from: b */
    public final String f10910b;

    /* renamed from: c */
    public final boolean f10911c;

    /* renamed from: d */
    public final long f10912d;

    /* renamed from: e */
    public final long f10913e;

    /* renamed from: f */
    public final C3506j f10914f;

    /* renamed from: g */
    public final String[] f10915g;

    /* renamed from: h */
    public final String f10916h;

    /* renamed from: i */
    public final String f10917i;

    /* renamed from: j */
    public final C3503g f10918j;

    /* renamed from: k */
    private final HashMap f10919k;

    /* renamed from: l */
    private final HashMap f10920l;

    /* renamed from: m */
    private List f10921m;

    /* renamed from: i */
    private static SpannableStringBuilder m10121i(String str, Map map) {
        if (!map.containsKey(str)) {
            C2566b bVar = new C2566b();
            bVar.f7065a = new SpannableStringBuilder();
            map.put(str, bVar);
        }
        CharSequence charSequence = ((C2566b) map.get(str)).f7065a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    /* renamed from: a */
    public final int mo7435a() {
        List list = this.f10921m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: b */
    public final C3503g mo7436b(int i) {
        List list = this.f10921m;
        if (list != null) {
            return (C3503g) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: c */
    public final void mo7437c(C3503g gVar) {
        if (this.f10921m == null) {
            this.f10921m = new ArrayList();
        }
        this.f10921m.add(gVar);
    }

    /* renamed from: d */
    public final void mo7438d(TreeSet treeSet, boolean z) {
        boolean equals = "p".equals(this.f10909a);
        boolean equals2 = "div".equals(this.f10909a);
        if (z || equals || (equals2 && this.f10917i != null)) {
            long j = this.f10912d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f10913e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f10921m != null) {
            for (int i = 0; i < this.f10921m.size(); i++) {
                C3503g gVar = (C3503g) this.f10921m.get(i);
                boolean z2 = true;
                if (!z && !equals) {
                    z2 = false;
                }
                gVar.mo7438d(treeSet, z2);
            }
        }
    }

    /* renamed from: e */
    public final void mo7439e(long j, String str, List list) {
        String str2;
        if (!BuildConfig.FLAVOR.equals(this.f10916h)) {
            str = this.f10916h;
        }
        if (!mo7442h(j) || !"div".equals(this.f10909a) || (str2 = this.f10917i) == null) {
            for (int i = 0; i < mo7435a(); i++) {
                mo7436b(i).mo7439e(j, str, list);
            }
            return;
        }
        list.add(new Pair(str, str2));
    }

    /* renamed from: f */
    public final void mo7440f(long j, Map map, Map map2, String str, Map map3) {
        C3503g gVar;
        Map map4 = map;
        if (mo7442h(j)) {
            String str2 = !BuildConfig.FLAVOR.equals(this.f10916h) ? this.f10916h : str;
            for (Map.Entry entry : this.f10920l.entrySet()) {
                String str3 = (String) entry.getKey();
                int intValue = this.f10919k.containsKey(str3) ? ((Integer) this.f10919k.get(str3)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    C2566b bVar = (C2566b) map3.get(str3);
                    bVar.getClass();
                    ((C3504h) map2.get(str2)).getClass();
                    C3506j a = C3505i.m10130a(this.f10914f, this.f10915g, map4);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.f7065a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        bVar.f7065a = spannableStringBuilder;
                    }
                    if (a != null) {
                        C3503g gVar2 = this.f10918j;
                        if (a.mo7443a() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(a.mo7443a()), intValue, intValue2, 33);
                        }
                        if (a.f10937f == 1) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, 33);
                        }
                        if (a.f10938g == 1) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, 33);
                        }
                        if (a.f10934c) {
                            if (a.f10934c) {
                                C2572h.m6791a(spannableStringBuilder, new ForegroundColorSpan(a.f10933b), intValue, intValue2);
                            } else {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                        }
                        if (a.f10936e) {
                            if (a.f10936e) {
                                C2572h.m6791a(spannableStringBuilder, new BackgroundColorSpan(a.f10935d), intValue, intValue2);
                            } else {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                        }
                        if (a.f10932a != null) {
                            C2572h.m6791a(spannableStringBuilder, new TypefaceSpan(a.f10932a), intValue, intValue2);
                        }
                        if (a.f10949r != null) {
                            C2572h.m6791a(spannableStringBuilder, new C2573i(), intValue, intValue2);
                        }
                        int i = a.f10944m;
                        if (i == 2) {
                            while (true) {
                                if (gVar2 != null) {
                                    C3506j a2 = C3505i.m10130a(gVar2.f10914f, gVar2.f10915g, map4);
                                    if (a2 != null && a2.f10944m == 1) {
                                        break;
                                    }
                                    gVar2 = gVar2.f10918j;
                                } else {
                                    gVar2 = null;
                                    break;
                                }
                            }
                            if (gVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(gVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        gVar = null;
                                        break;
                                    }
                                    C3503g gVar3 = (C3503g) arrayDeque.pop();
                                    C3506j a3 = C3505i.m10130a(gVar3.f10914f, gVar3.f10915g, map4);
                                    if (a3 != null && a3.f10944m == 3) {
                                        gVar = gVar3;
                                        break;
                                    }
                                    for (int a4 = gVar3.mo7435a() - 1; a4 >= 0; a4--) {
                                        arrayDeque.push(gVar3.mo7436b(a4));
                                    }
                                }
                                if (gVar != null) {
                                    if (gVar.mo7435a() != 1 || gVar.mo7436b(0).f10910b == null) {
                                        C2633u.m7049d("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str4 = gVar.mo7436b(0).f10910b;
                                        int i2 = C2612ak.f7249a;
                                        C3506j a5 = C3505i.m10130a(gVar.f10914f, gVar.f10915g, map4);
                                        if (a5 == null || a5.f10945n == -1) {
                                            C3505i.m10130a(gVar2.f10914f, gVar2.f10915g, map4);
                                        }
                                        spannableStringBuilder.setSpan(new C2571g(), intValue, intValue2, 33);
                                    }
                                }
                            }
                        } else if (i == 3 || i == 4) {
                            spannableStringBuilder.setSpan(new C3497a(), intValue, intValue2, 33);
                        }
                        if (a.f10948q == 1) {
                            C2572h.m6791a(spannableStringBuilder, new C2569e(), intValue, intValue2);
                        }
                        int i3 = a.f10941j;
                        if (i3 == 1) {
                            C2572h.m6791a(spannableStringBuilder, new AbsoluteSizeSpan((int) a.f10942k, true), intValue, intValue2);
                        } else if (i3 == 2) {
                            C2572h.m6791a(spannableStringBuilder, new RelativeSizeSpan(a.f10942k), intValue, intValue2);
                        } else if (i3 == 3) {
                            C2572h.m6791a(spannableStringBuilder, new RelativeSizeSpan(a.f10942k / 100.0f), intValue, intValue2);
                        }
                        if ("p".equals(this.f10909a)) {
                            float f = a.f10950s;
                            if (f != Float.MAX_VALUE) {
                                bVar.f7080p = (f * -90.0f) / 100.0f;
                            }
                            Layout.Alignment alignment = a.f10946o;
                            if (alignment != null) {
                                bVar.f7067c = alignment;
                            }
                            Layout.Alignment alignment2 = a.f10947p;
                            if (alignment2 != null) {
                                bVar.f7068d = alignment2;
                            }
                        }
                    } else {
                        continue;
                    }
                } else {
                    Map map5 = map2;
                    Map map6 = map3;
                }
            }
            Map map7 = map2;
            Map map8 = map3;
            for (int i4 = 0; i4 < mo7435a(); i4++) {
                mo7436b(i4).mo7440f(j, map, map2, str2, map3);
            }
        }
    }

    /* renamed from: g */
    public final void mo7441g(long j, boolean z, String str, Map map) {
        this.f10919k.clear();
        this.f10920l.clear();
        if (!"metadata".equals(this.f10909a)) {
            if (!BuildConfig.FLAVOR.equals(this.f10916h)) {
                str = this.f10916h;
            }
            if (this.f10911c && z) {
                SpannableStringBuilder i = m10121i(str, map);
                String str2 = this.f10910b;
                str2.getClass();
                i.append(str2);
            } else if ("br".equals(this.f10909a) && z) {
                m10121i(str, map).append(10);
            } else if (mo7442h(j)) {
                for (Map.Entry entry : map.entrySet()) {
                    CharSequence charSequence = ((C2566b) entry.getValue()).f7065a;
                    charSequence.getClass();
                    this.f10919k.put((String) entry.getKey(), Integer.valueOf(charSequence.length()));
                }
                boolean equals = "p".equals(this.f10909a);
                for (int i2 = 0; i2 < mo7435a(); i2++) {
                    mo7436b(i2).mo7441g(j, z || equals, str, map);
                }
                if (equals) {
                    SpannableStringBuilder i3 = m10121i(str, map);
                    int length = i3.length();
                    do {
                        length--;
                        if (length < 0 || i3.charAt(length) != ' ') {
                            if (length >= 0 && i3.charAt(length) != 10) {
                                i3.append(10);
                            }
                        }
                        length--;
                        break;
                    } while (i3.charAt(length) != ' ');
                    i3.append(10);
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    CharSequence charSequence2 = ((C2566b) entry2.getValue()).f7065a;
                    charSequence2.getClass();
                    this.f10920l.put((String) entry2.getKey(), Integer.valueOf(charSequence2.length()));
                }
            }
        }
    }

    /* renamed from: h */
    public final boolean mo7442h(long j) {
        long j2 = this.f10912d;
        if (j2 == -9223372036854775807L) {
            if (this.f10913e == -9223372036854775807L) {
                return true;
            }
            j2 = -9223372036854775807L;
        }
        if (j2 <= j && this.f10913e == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= this.f10913e) {
            return j2 <= j && j < this.f10913e;
        }
        return true;
    }

    public C3503g(String str, String str2, long j, long j2, C3506j jVar, String[] strArr, String str3, String str4, C3503g gVar) {
        this.f10909a = str;
        this.f10910b = str2;
        this.f10917i = str4;
        this.f10914f = jVar;
        this.f10915g = strArr;
        this.f10911c = str2 != null;
        this.f10912d = j;
        this.f10913e = j2;
        str3.getClass();
        this.f10916h = str3;
        this.f10918j = gVar;
        this.f10919k = new HashMap();
        this.f10920l = new HashMap();
    }
}
