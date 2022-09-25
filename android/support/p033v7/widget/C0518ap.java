package android.support.p033v7.widget;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2090e;
import androidx.core.p098j.C2091f;
import androidx.core.p098j.C2092g;

/* renamed from: android.support.v7.widget.ap */
/* compiled from: PG */
final class C0518ap {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    static boolean m1919a(DragEvent dragEvent, TextView textView, Activity activity) {
        C2091f fVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                fVar = new C2090e(clipData, 3);
            } else {
                fVar = new C2092g(clipData, 3);
            }
            C2043bi.m5592u(textView, fVar.mo5258a());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    /* renamed from: b */
    static boolean m1920b(DragEvent dragEvent, View view, Activity activity) {
        C2091f fVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            fVar = new C2090e(clipData, 3);
        } else {
            fVar = new C2092g(clipData, 3);
        }
        C2043bi.m5592u(view, fVar.mo5258a());
        return true;
    }
}
