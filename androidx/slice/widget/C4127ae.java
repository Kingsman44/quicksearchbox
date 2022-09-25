package androidx.slice.widget;

import androidx.p060c.C0977g;
import androidx.slice.C4093a;
import androidx.slice.SliceItem;
import androidx.slice.p194a.C4101h;
import com.evernote.android.state.BuildConfig;
import java.util.Arrays;

/* renamed from: androidx.slice.widget.ae */
/* compiled from: PG */
public final class C4127ae {

    /* renamed from: a */
    final C4130ah f13236a;

    /* renamed from: b */
    final int f13237b;

    /* renamed from: c */
    final long f13238c;

    public C4127ae(C4130ah ahVar, C4125ac acVar) {
        int i;
        String str;
        this.f13236a = ahVar;
        SliceItem sliceItem = ahVar.f13268m;
        if ("message".equals(sliceItem.f13093c)) {
            i = C4101h.m11751d(sliceItem, (String) null, "source") != null ? 4 : 5;
        } else if (C4093a.m11737a(sliceItem.f13091a, "horizontal")) {
            i = 3;
        } else {
            i = !C4093a.m11737a(sliceItem.f13091a, "list_item") ? 2 : 1;
        }
        this.f13237b = i;
        SliceItem sliceItem2 = ahVar.f13268m;
        if ("slice".equals(sliceItem2.f13092b) || "action".equals(sliceItem2.f13092b)) {
            str = String.valueOf(Arrays.asList(sliceItem2.mo8596d().f13088d).size());
        } else {
            str = sliceItem2.mo8598f(BuildConfig.FLAVOR);
        }
        if (!acVar.f13232b.containsKey(str)) {
            C0977g gVar = acVar.f13232b;
            long j = acVar.f13231a;
            acVar.f13231a = 1 + j;
            gVar.put(str, Long.valueOf(j));
        }
        long longValue = ((Long) acVar.f13232b.get(str)).longValue();
        Integer num = (Integer) acVar.f13233c.get(str);
        int intValue = num != null ? num.intValue() : 0;
        acVar.f13233c.put(str, Integer.valueOf(intValue + 1));
        this.f13238c = longValue + ((long) (intValue * 10000));
    }
}
