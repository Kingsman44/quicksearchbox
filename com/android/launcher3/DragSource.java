package com.android.launcher3;

import android.view.View;
import com.android.launcher3.DropTarget;

/* compiled from: PG */
public interface DragSource {
    float getIntrinsicIconScaleFactor();

    void onDropCompleted(View view, DropTarget.DragObject dragObject, boolean z, boolean z2);

    void onFlingToDeleteCompleted();

    boolean supportsAppInfoDropTarget();

    boolean supportsDeleteDropTarget();

    boolean supportsFlingToDelete();
}
