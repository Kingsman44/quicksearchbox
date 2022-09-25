package com.google.android.libraries.p579ar.sceneviewer.debug;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.p579ar.sceneviewer.modelviewer.ModelViewer;
import com.google.common.p4535g.C59203do;
import com.google.p3723ar.core.viewer.jniprotolite.Types;
import java.util.Locale;

/* renamed from: com.google.android.libraries.ar.sceneviewer.debug.DebugInfoView */
/* compiled from: PG */
public final class DebugInfoView extends LinearLayout {
    private static final long FRAME_TIME_UPDATE_DELAY_MILLISECONDS = 500;
    private boolean enabled;
    private final C10695b frameTimeTracker = new C10695b();
    private TextView frameTimeView;
    private long lastFrameDisplayUpdate;
    private ModelViewer modelViewer;

    public DebugInfoView(Context context) {
        super(context);
    }

    private void updateDebugTextColorForMode(TextView textView) {
        if (this.modelViewer.getMode() == Types.ViewerMode.AR) {
            textView.setTextColor(getResources().getColor(C10690R.color.material_grey_50));
        } else {
            textView.setTextColor(getResources().getColor(C10690R.color.material_grey_800));
        }
    }

    public void initialize(ModelViewer modelViewer2) {
        this.modelViewer = modelViewer2;
        modelViewer2.setDebugFrameCallback(new DebugInfoView$$ExternalSyntheticLambda0(this));
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.frameTimeView = (TextView) findViewById(C10690R.C10692id.frame_time_view);
    }

    public void setDebugEnabled(boolean z) {
        this.enabled = z;
        this.modelViewer.enableDebugging(z);
        if (z) {
            this.lastFrameDisplayUpdate = SystemClock.elapsedRealtime();
            this.frameTimeTracker.f35628b = System.nanoTime();
            setVisibility(0);
            return;
        }
        this.frameTimeTracker.mo18775a();
        setVisibility(8);
    }

    public void update() {
        if (this.enabled && this.frameTimeView != null) {
            this.frameTimeTracker.mo18775a();
            this.frameTimeTracker.f35628b = System.nanoTime();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime > this.lastFrameDisplayUpdate + FRAME_TIME_UPDATE_DELAY_MILLISECONDS) {
                TextView textView = this.frameTimeView;
                Locale locale = Locale.getDefault();
                Object[] objArr = new Object[1];
                C10694a aVar = this.frameTimeTracker.f35627a;
                objArr[0] = Double.valueOf(aVar != null ? aVar.f35626a : C59203do.f157270a);
                textView.setText(String.format(locale, "Frame Time: %.4fms", objArr));
                this.lastFrameDisplayUpdate = elapsedRealtime;
                updateDebugTextColorForMode(this.frameTimeView);
            }
        }
    }

    public DebugInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DebugInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
