package androidx.media3.extractor.p163j.p169f;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.media3.common.p135a.C2566b;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.p163j.C3482c;
import com.evernote.android.state.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: androidx.media3.extractor.j.f.k */
/* compiled from: PG */
final class C3507k implements C3482c {

    /* renamed from: a */
    private final C3503g f10951a;

    /* renamed from: b */
    private final long[] f10952b;

    /* renamed from: c */
    private final Map f10953c;

    /* renamed from: d */
    private final Map f10954d;

    /* renamed from: e */
    private final Map f10955e;

    public C3507k(C3503g gVar, Map map, Map map2, Map map3) {
        this.f10951a = gVar;
        this.f10954d = map2;
        this.f10955e = map3;
        this.f10953c = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        gVar.mo7438d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.f10952b = jArr;
    }

    /* renamed from: a */
    public final int mo7193a() {
        return this.f10952b.length;
    }

    /* renamed from: b */
    public final int mo7194b(long j) {
        int av = C2612ak.m6972av(this.f10952b, j, false);
        if (av < this.f10952b.length) {
            return av;
        }
        return -1;
    }

    /* renamed from: d */
    public final List mo7195d(long j) {
        C3503g gVar = this.f10951a;
        Map map = this.f10953c;
        Map map2 = this.f10954d;
        Map map3 = this.f10955e;
        ArrayList arrayList = new ArrayList();
        gVar.mo7439e(j, gVar.f10916h, arrayList);
        TreeMap treeMap = new TreeMap();
        C3503g gVar2 = gVar;
        long j2 = j;
        gVar2.mo7441g(j2, false, gVar.f10916h, treeMap);
        gVar2.mo7440f(j2, map, map2, gVar.f10916h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C3504h hVar = (C3504h) map2.get(pair.first);
                hVar.getClass();
                C2566b bVar = new C2566b();
                bVar.f7066b = decodeByteArray;
                bVar.f7072h = hVar.f10923b;
                bVar.f7073i = 0;
                bVar.f7069e = hVar.f10924c;
                bVar.f7070f = 0;
                bVar.f7071g = hVar.f10926e;
                bVar.f7076l = hVar.f10927f;
                bVar.f7077m = hVar.f10928g;
                bVar.f7079o = hVar.f10931j;
                arrayList2.add(bVar.mo6076a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C3504h hVar2 = (C3504h) map2.get(entry.getKey());
            hVar2.getClass();
            C2566b bVar2 = (C2566b) entry.getValue();
            CharSequence charSequence = bVar2.f7065a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (C3497a aVar : (C3497a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C3497a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), BuildConfig.FLAVOR);
            }
            for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i3 = i2 + 1;
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i6 = 0; i6 < spannableStringBuilder.length() - 1; i6++) {
                if (spannableStringBuilder.charAt(i6) == 10) {
                    int i7 = i6 + 1;
                    if (spannableStringBuilder.charAt(i7) == ' ') {
                        spannableStringBuilder.delete(i7, i6 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
                if (spannableStringBuilder.charAt(i8) == ' ') {
                    int i9 = i8 + 1;
                    if (spannableStringBuilder.charAt(i9) == 10) {
                        spannableStringBuilder.delete(i8, i9);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == 10) {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = hVar2.f10924c;
            int i10 = hVar2.f10925d;
            bVar2.f7069e = f;
            bVar2.f7070f = i10;
            bVar2.f7071g = hVar2.f10926e;
            bVar2.f7072h = hVar2.f10923b;
            bVar2.f7076l = hVar2.f10927f;
            float f2 = hVar2.f10930i;
            int i11 = hVar2.f10929h;
            bVar2.f7075k = f2;
            bVar2.f7074j = i11;
            bVar2.f7079o = hVar2.f10931j;
            arrayList2.add(bVar2.mo6076a());
        }
        return arrayList2;
    }

    /* renamed from: ff */
    public final long mo7196ff(int i) {
        return this.f10952b[i];
    }
}
