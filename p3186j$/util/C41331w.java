package p3186j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;

/* renamed from: j$.util.w */
public final /* synthetic */ class C41331w implements Comparator, Serializable {
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) ((Map.Entry) obj).getValue()).compareTo(((Map.Entry) obj2).getValue());
    }
}
