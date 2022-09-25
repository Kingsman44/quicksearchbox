package androidx.navigation;

import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.navigation.be */
/* compiled from: PG */
public final class C3837be {
    /* renamed from: a */
    public static final C3860ca m11067a(TypedValue typedValue, C3860ca caVar, C3860ca caVar2, String str, String str2) {
        if (caVar == null || caVar == caVar2) {
            return caVar == null ? caVar2 : caVar;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }
}
