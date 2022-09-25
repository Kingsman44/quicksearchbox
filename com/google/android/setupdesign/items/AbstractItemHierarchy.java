package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.setupdesign.C45318g;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public abstract class AbstractItemHierarchy {

    /* renamed from: a */
    private final ArrayList f118399a = new ArrayList();

    public AbstractItemHierarchy() {
    }

    /* renamed from: a */
    public final void mo49242a(int i) {
        int i2;
        if (i < 0) {
            Log.w("AbstractItemHierarchy", "notifyItemRangeChanged: Invalid position=" + i);
            return;
        }
        ArrayList arrayList = this.f118399a;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ItemGroup itemGroup = (ItemGroup) arrayList.get(i3);
            List list = itemGroup.f118401a;
            int size2 = list.size();
            int i4 = 0;
            while (true) {
                i2 = -1;
                if (i4 >= size2) {
                    i4 = -1;
                    break;
                } else if (list.get(i4) == this) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 != -1) {
                int size3 = itemGroup.f118401a.size();
                int i5 = -1;
                while (i5 < 0 && i4 < size3) {
                    i5 = itemGroup.f118402b.get(i4, -1);
                    i4++;
                }
                i2 = i5 < 0 ? 0 : i5;
            }
            if (i2 >= 0) {
                itemGroup.mo49242a(i2 + i);
            } else {
                Log.e("ItemGroup", "Unexpected child change ".concat(toString()));
            }
        }
    }

    public AbstractItemHierarchy(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C45318g.f118383b);
        obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
    }
}
