package com.google.android.libraries.p579ar.sceneviewer.notification;

import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import com.google.p3723ar.core.viewer.jniprotolite.Types;

/* renamed from: com.google.android.libraries.ar.sceneviewer.notification.Notification */
/* compiled from: PG */
enum Notification {
    NONE((String) null, C10741a.LOW, (Integer) null, (C10741a) null),
    OCCLUSION_ON(Integer.valueOf(C10737R.string.occlusion_on_notification), C10741a.LOW, 3000, (C10741a) null),
    OCCLUSION_OFF(Integer.valueOf(C10737R.string.occlusion_off_notification), C10741a.LOW, 3000, (C10741a) null),
    MOVE_CLOSER(Integer.valueOf(C10737R.string.occlusion_move_closer_notification), C10741a.HIGH, (Integer) null, (C10741a) null),
    SCALING_DISABLED(r11, r12, r18, (C10741a) null),
    POINT_TOWARDS_EMPTY_SPACE(Integer.valueOf(C10737R.string.instant_placement_point_towards_empty_space_notification), C10741a.HIGH, (Integer) null, (C10741a) null),
    ROOM_TOO_DARK(Integer.valueOf(C10737R.string.instant_placement_room_too_dark_notification), C10741a.HIGH, (Integer) null, ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.NOTIFICATION_TOO_DARK),
    MOVING_TOO_FAST(Integer.valueOf(C10737R.string.instant_placement_moving_too_fast_notification), C10741a.HIGH, (Integer) null, ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.NOTIFICATION_TOO_FAST),
    NO_FEATURES(Integer.valueOf(C10737R.string.instant_placement_no_features), C10741a.HIGH, (Integer) null, ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.NOTIFICATION_NO_FEATURES),
    EXPERIMENTAL_MODE_RESOURCE_EXHAUSTED(Integer.valueOf(C10737R.string.experimental_mode_resource_exhausted_warning), C10741a.HIGH, 5000, (C10741a) null),
    EXPERIMENTAL_MODE_UNEXPECTEDLY_DISCONNECTED(Integer.valueOf(C10737R.string.experimental_mode_unexpectedly_disconnected_warning), C10741a.HIGH, 5000, (C10741a) null),
    EXPERIMENTAL_MODE_CLIENT_FAILED_TO_START(Integer.valueOf(C10737R.string.experimental_mode_client_failed_to_start_warning), C10741a.HIGH, 5000, (C10741a) null),
    EXPERIMENTAL_TEST_IN_PROGRESS(Integer.valueOf(C10737R.string.experimental_test_in_progress), C10741a.HIGH, r18, (C10741a) null),
    VERTICAL_PLACEMENT_PEDESTAL_GUIDANCE(Integer.valueOf(C10737R.string.vertical_placement_pedestal_guidance), C10741a.HIGH, (Integer) null, (C10741a) null),
    VERTICAL_PLACEMENT_ROTATION_GUIDANCE(Integer.valueOf(C10737R.string.vertical_placement_rotation_guidance), C10741a.HIGH, (Integer) null, (C10741a) null),
    VERTICAL_PLACEMENT_UP_ARROW_GUIDANCE(Integer.valueOf(C10737R.string.vertical_placement_up_arrow_guidance), C10741a.HIGH, (Integer) null, (C10741a) null),
    SIX_DOF_GUIDANCE(Integer.valueOf(C10737R.string.six_dof_guidance), C10741a.HIGH, (Integer) null, (C10741a) null),
    DRAG_GUIDANCE(Integer.valueOf(C10737R.string.onboarding_guidance_drag), C10741a.HIGH, (Integer) null, (C10741a) null),
    PINCH_GUIDANCE(Integer.valueOf(C10737R.string.onboarding_guidance_pinch), C10741a.HIGH, (Integer) null, (C10741a) null),
    TWIST_GUIDANCE(Integer.valueOf(C10737R.string.onboarding_guidance_twist), C10741a.HIGH, (Integer) null, (C10741a) null);
    

    /* renamed from: u */
    public final Integer f35695u;

    /* renamed from: v */
    public final C10741a f35696v;

    /* renamed from: w */
    public final Integer f35697w;

    /* renamed from: x */
    public final ArViewerLogEnumOuterClass.ArViewerLogEnum.Action f35698x;

    private Notification(Integer num, C10741a aVar, Integer num2, ArViewerLogEnumOuterClass.ArViewerLogEnum.Action action) {
        this.f35695u = num;
        this.f35696v = aVar;
        this.f35697w = num2;
        this.f35698x = action;
    }

    /* renamed from: a */
    public static Notification m25741a(Types.Notification notification) {
        Types.Notification notification2 = Types.Notification.NO_NOTIFICATION;
        switch (notification.ordinal()) {
            case 1:
                return MOVE_CLOSER;
            case 2:
                return OCCLUSION_OFF;
            case 3:
                return OCCLUSION_ON;
            case 4:
                return EXPERIMENTAL_MODE_RESOURCE_EXHAUSTED;
            case 5:
                return EXPERIMENTAL_MODE_UNEXPECTEDLY_DISCONNECTED;
            case 6:
                return EXPERIMENTAL_MODE_CLIENT_FAILED_TO_START;
            case 7:
                return EXPERIMENTAL_TEST_IN_PROGRESS;
            case 8:
                return VERTICAL_PLACEMENT_PEDESTAL_GUIDANCE;
            case 9:
                return VERTICAL_PLACEMENT_ROTATION_GUIDANCE;
            case 10:
                return VERTICAL_PLACEMENT_UP_ARROW_GUIDANCE;
            case 11:
                return SIX_DOF_GUIDANCE;
            case 13:
                return ROOM_TOO_DARK;
            case 14:
                return NO_FEATURES;
            case 15:
                return MOVING_TOO_FAST;
            case 16:
                return DRAG_GUIDANCE;
            case 17:
                return TWIST_GUIDANCE;
            case 18:
                return PINCH_GUIDANCE;
            default:
                return NONE;
        }
    }
}
