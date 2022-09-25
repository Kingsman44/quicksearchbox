package androidx.slice.p194a;

import androidx.slice.SliceItem;

/* renamed from: androidx.slice.a.e */
/* compiled from: PG */
public final /* synthetic */ class C4098e implements C4100g {

    /* renamed from: a */
    public final /* synthetic */ String f13124a;

    /* renamed from: b */
    public final /* synthetic */ String[] f13125b;

    /* renamed from: c */
    public final /* synthetic */ String[] f13126c;

    public /* synthetic */ C4098e(String str, String[] strArr, String[] strArr2) {
        this.f13124a = str;
        this.f13125b = strArr;
        this.f13126c = strArr2;
    }

    /* renamed from: a */
    public final boolean mo8608a(Object obj) {
        SliceItem sliceItem = (SliceItem) obj;
        return C4101h.m11753f(sliceItem, this.f13124a) && C4101h.m11756i(sliceItem, this.f13125b) && !C4101h.m11755h(sliceItem, this.f13126c);
    }
}
