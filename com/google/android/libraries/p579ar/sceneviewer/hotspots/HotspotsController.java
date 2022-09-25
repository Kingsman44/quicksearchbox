package com.google.android.libraries.p579ar.sceneviewer.hotspots;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.FloatingButton;
import com.google.android.libraries.p579ar.sceneviewer.utilities.AnimationUtilities;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p3723ar.core.viewer.jniprotolite.Types;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.ar.sceneviewer.hotspots.HotspotsController */
/* compiled from: PG */
public final class HotspotsController {
    private static final int ANIMATION_DURATION_MS = 300;
    private static final C59071e logger = C59071e.m91332i("com.google.android.libraries.ar.sceneviewer.hotspots.HotspotsController");
    private final Map annotationMap = new HashMap();
    private final Context context;
    private boolean enabled;
    private final Map hotspotMap = new HashMap();

    public HotspotsController(Context context2) {
        this.context = context2;
        this.enabled = true;
    }

    private void updateHotspotAnnotationPosition(int i) {
        Map map = this.hotspotMap;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf) && this.annotationMap.containsKey(valueOf)) {
            FloatingButton floatingButton = (FloatingButton) this.hotspotMap.get(valueOf);
            floatingButton.getClass();
            View view = (View) this.annotationMap.get(valueOf);
            view.getClass();
            view.setX(floatingButton.getX() + ((float) floatingButton.getHeight()));
            view.setY(floatingButton.getY() + ((float) floatingButton.getWidth()));
        }
    }

    public boolean addHotspot(int i, FloatingButton floatingButton) {
        if (containsHotspot(i)) {
            ((C59052c) ((C59052c) logger.mo56226d()).mo56372aa(42328)).mo56386p("Hotspot already exists in the controller.");
            return false;
        }
        this.hotspotMap.put(Integer.valueOf(i), floatingButton);
        floatingButton.setEnabled(this.enabled);
        return true;
    }

    public boolean containsHotspot(int i) {
        return this.hotspotMap.containsKey(Integer.valueOf(i));
    }

    public boolean containsHotspotAnnotation(int i) {
        return this.annotationMap.containsKey(Integer.valueOf(i));
    }

    public FloatingButton createHotspot(int i, ViewGroup viewGroup) {
        FloatingButton floatingButton = (FloatingButton) LayoutInflater.from(this.context).inflate(C10705R.layout.floating_button, (ViewGroup) null, false);
        ((C59052c) ((C59052c) logger.mo56224b()).mo56372aa(42327)).mo56387q("Button created with id: %d", i);
        addHotspot(i, floatingButton);
        viewGroup.addView(floatingButton);
        return floatingButton;
    }

    public FloatingButton getHotspot(int i) {
        return (FloatingButton) this.hotspotMap.get(Integer.valueOf(i));
    }

    public View getHotspotAnnotation(int i) {
        return (View) this.annotationMap.get(Integer.valueOf(i));
    }

    public void removeAnnotation(int i) {
        this.annotationMap.remove(Integer.valueOf(i));
    }

    public void setEnabled(boolean z) {
        for (Integer intValue : this.hotspotMap.keySet()) {
            int intValue2 = intValue.intValue();
            Map map = this.hotspotMap;
            Integer valueOf = Integer.valueOf(intValue2);
            FloatingButton floatingButton = (FloatingButton) map.get(valueOf);
            floatingButton.setEnabled(z, ANIMATION_DURATION_MS);
            if (this.annotationMap.containsKey(valueOf)) {
                View view = (View) this.annotationMap.get(valueOf);
                view.getClass();
                boolean z2 = false;
                if (z && Types.Visibility.VISIBLE.equals(floatingButton.getVisibilityState())) {
                    z2 = true;
                }
                AnimationUtilities.animateVisibility(view, z2, ANIMATION_DURATION_MS);
            }
        }
        this.enabled = z;
    }

    public boolean setHotspotAnnotation(int i, View view) {
        if (!containsHotspot(i)) {
            return false;
        }
        Map map = this.annotationMap;
        Integer valueOf = Integer.valueOf(i);
        map.put(valueOf, view);
        FloatingButton floatingButton = (FloatingButton) this.hotspotMap.get(valueOf);
        floatingButton.getClass();
        if (this.enabled) {
            updateHotspotAnnotationPosition(i);
        }
        AnimationUtilities.animateVisibility(view, Types.Visibility.VISIBLE.equals(floatingButton.getVisibilityState()), ANIMATION_DURATION_MS);
        return true;
    }

    public boolean setHotspotPosition(int i, int i2, int i3) {
        if (!this.enabled || !containsHotspot(i)) {
            return false;
        }
        FloatingButton hotspot = getHotspot(i);
        hotspot.getClass();
        hotspot.setX(((float) i2) - (((float) hotspot.getWidth()) / 2.0f));
        hotspot.setY(((float) i3) - (((float) hotspot.getHeight()) / 2.0f));
        if (!this.annotationMap.containsKey(Integer.valueOf(i))) {
            return true;
        }
        updateHotspotAnnotationPosition(i);
        return true;
    }

    public boolean setHotspotState(int i, Types.Visibility visibility) {
        boolean z = false;
        if (!containsHotspot(i)) {
            ((C59052c) ((C59052c) logger.mo56226d()).mo56372aa(42330)).mo56387q("Hotspot not found in controller. Id: %d", i);
            return false;
        }
        Map map = this.hotspotMap;
        Integer valueOf = Integer.valueOf(i);
        FloatingButton floatingButton = (FloatingButton) map.get(valueOf);
        floatingButton.getClass();
        floatingButton.setVisibilityState(visibility, ANIMATION_DURATION_MS);
        if (this.annotationMap.containsKey(valueOf)) {
            View view = (View) this.annotationMap.get(valueOf);
            view.getClass();
            if (this.enabled && Types.Visibility.VISIBLE.equals(floatingButton.getVisibilityState())) {
                z = true;
            }
            AnimationUtilities.animateVisibility(view, z, ANIMATION_DURATION_MS);
        }
        return true;
    }

    public boolean setHotspotAnnotation(int i, String str) {
        if (containsHotspotAnnotation(i)) {
            View hotspotAnnotation = getHotspotAnnotation(i);
            hotspotAnnotation.getClass();
            TextView textView = (TextView) hotspotAnnotation;
            if (C58837ba.m90859h(str)) {
                ((ViewGroup) textView.getParent()).removeView(textView);
                removeAnnotation(i);
                return true;
            }
            textView.setText(str);
            return true;
        }
        FloatingButton hotspot = getHotspot(i);
        if (hotspot == null) {
            return false;
        }
        ((C59052c) ((C59052c) logger.mo56224b()).mo56372aa(42329)).mo56387q("Creating annotation at hotspot id: %d", i);
        TextView textView2 = (TextView) LayoutInflater.from(this.context).inflate(C10705R.layout.annotation_text_view, (ViewGroup) null, false);
        ((ViewGroup) hotspot.getParent()).addView(textView2);
        textView2.setText(str);
        return setHotspotAnnotation(i, (View) textView2);
    }
}
