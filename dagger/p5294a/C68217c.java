package dagger.p5294a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: dagger.a.c */
/* compiled from: PG */
public final class C68217c {
    /* renamed from: a */
    public static int m98513a(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static LinkedHashMap m98514b(int i) {
        return new LinkedHashMap(m98513a(i));
    }

    /* renamed from: c */
    public static List m98515c(int i) {
        return new ArrayList(i);
    }
}
