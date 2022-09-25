package com.android.p247a;

/* renamed from: com.android.a.a */
/* compiled from: PG */
public final class C4980a {

    /* renamed from: a */
    private final int f15798a;

    /* renamed from: b */
    private final Object[] f15799b;

    public C4980a(int i, Object... objArr) {
        this.f15798a = i;
        this.f15799b = objArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("mIssueId: ");
        sb.append(this.f15798a);
        for (Object obj : this.f15799b) {
            sb.append(", ");
            sb.append(obj.toString());
        }
        return sb.toString();
    }
}
