package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.core.app.ax */
/* compiled from: PG */
final class C1807ax {
    /* renamed from: a */
    static RemoteInput.Builder m4970a(RemoteInput.Builder builder, String str, boolean z) {
        return builder.setAllowDataType(str, z);
    }

    /* renamed from: b */
    static Map m4971b(Intent intent, String str) {
        return RemoteInput.getDataResultsFromIntent(intent, str);
    }

    /* renamed from: c */
    static Set m4972c(Object obj) {
        return ((RemoteInput) obj).getAllowedDataTypes();
    }

    /* renamed from: d */
    static void m4973d(C1811ba baVar, Intent intent, Map map) {
        RemoteInput.addDataResultToIntent(C1806aw.m4967a(baVar), intent, map);
    }
}
