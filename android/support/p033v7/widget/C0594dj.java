package android.support.p033v7.widget;

import android.util.SparseIntArray;

/* renamed from: android.support.v7.widget.dj */
/* compiled from: PG */
public abstract class C0594dj {
    public boolean mCacheSpanIndices = false;
    final SparseIntArray mSpanGroupIndexCache = new SparseIntArray();
    final SparseIntArray mSpanIndexCache = new SparseIntArray();

    /* access modifiers changed from: package-private */
    public final int getCachedSpanIndex(int i, int i2) {
        if (!this.mCacheSpanIndices) {
            return getSpanIndex(i, i2);
        }
        int i3 = this.mSpanIndexCache.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int spanIndex = getSpanIndex(i, i2);
        this.mSpanIndexCache.put(i, spanIndex);
        return spanIndex;
    }

    public final int getSpanGroupIndex(int i, int i2) {
        int spanSize = getSpanSize(i);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int spanSize2 = getSpanSize(i5);
            i3 += spanSize2;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = spanSize2;
            }
        }
        return i3 + spanSize > i2 ? i4 + 1 : i4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0059 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getSpanIndex(int r9, int r10) {
        /*
            r8 = this;
            int r0 = r8.getSpanSize(r9)
            r1 = 0
            if (r0 != r10) goto L_0x0008
            return r1
        L_0x0008:
            boolean r2 = r8.mCacheSpanIndices
            if (r2 == 0) goto L_0x0043
            android.util.SparseIntArray r2 = r8.mSpanIndexCache
            int r3 = r2.size()
            r4 = -1
            int r3 = r3 + r4
            r5 = 0
        L_0x0015:
            if (r5 > r3) goto L_0x0028
            int r6 = r5 + r3
            int r6 = r6 >>> 1
            int r7 = r2.keyAt(r6)
            if (r7 >= r9) goto L_0x0024
            int r5 = r6 + 1
            goto L_0x0015
        L_0x0024:
            int r6 = r6 + -1
            r3 = r6
            goto L_0x0015
        L_0x0028:
            int r5 = r5 + r4
            if (r5 < 0) goto L_0x0035
            int r3 = r2.size()
            if (r5 >= r3) goto L_0x0035
            int r4 = r2.keyAt(r5)
        L_0x0035:
            if (r4 < 0) goto L_0x0043
            android.util.SparseIntArray r2 = r8.mSpanIndexCache
            int r2 = r2.get(r4)
            int r3 = r8.getSpanSize(r4)
            int r2 = r2 + r3
            goto L_0x0053
        L_0x0043:
            r2 = 0
            r4 = 0
        L_0x0045:
            if (r4 >= r9) goto L_0x0056
            int r3 = r8.getSpanSize(r4)
            int r2 = r2 + r3
            if (r2 != r10) goto L_0x0050
            r2 = 0
            goto L_0x0053
        L_0x0050:
            if (r2 <= r10) goto L_0x0053
            r2 = r3
        L_0x0053:
            int r4 = r4 + 1
            goto L_0x0045
        L_0x0056:
            int r0 = r0 + r2
            if (r0 > r10) goto L_0x005a
            return r2
        L_0x005a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.C0594dj.getSpanIndex(int, int):int");
    }

    public abstract int getSpanSize(int i);
}
