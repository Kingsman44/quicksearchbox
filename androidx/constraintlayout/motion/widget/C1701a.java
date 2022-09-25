package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.view.View;

/* renamed from: androidx.constraintlayout.motion.widget.a */
/* compiled from: PG */
public final class C1701a {
    /* renamed from: a */
    public static String m4618a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(fileName).length() + 15);
        sb.append(".(");
        sb.append(fileName);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: b */
    public static String m4619b(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    /* renamed from: c */
    public static String m4620c(Context context, int i) {
        if (i == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder(12);
            sb.append("?");
            sb.append(i);
            return sb.toString();
        }
    }

    /* renamed from: d */
    public static String m4621d(MotionLayout motionLayout, int i) {
        if (i == -1) {
            return "UNDEFINED";
        }
        return motionLayout.getContext().getResources().getResourceEntryName(i);
    }
}
