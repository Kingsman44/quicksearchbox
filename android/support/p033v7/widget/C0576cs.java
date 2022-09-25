package android.support.p033v7.widget;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: android.support.v7.widget.cs */
/* compiled from: PG */
final class C0576cs {

    /* renamed from: a */
    public static final Field f2223a;

    static {
        Field field;
        NoSuchFieldException e;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            try {
                field.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                e = e2;
            }
        } catch (NoSuchFieldException e3) {
            e = e3;
            field = null;
            e.printStackTrace();
            f2223a = field;
        }
        f2223a = field;
    }
}
