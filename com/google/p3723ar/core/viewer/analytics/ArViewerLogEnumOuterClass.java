package com.google.p3723ar.core.viewer.analytics;

import com.google.protobuf.C62897ae;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogEnumOuterClass */
/* compiled from: PG */
public final class ArViewerLogEnumOuterClass {

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogEnumOuterClass$ArViewerLogEnum */
    /* compiled from: PG */
    public final class ArViewerLogEnum extends C62942bv implements ArViewerLogEnumOrBuilder {
        /* access modifiers changed from: private */
        public static final ArViewerLogEnum DEFAULT_INSTANCE;
        private static volatile C63010eb PARSER;

        /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogEnumOuterClass$ArViewerLogEnum$Action */
        /* compiled from: PG */
        public enum Action implements C62957cd {
            ACTION_UNKNOWN(0),
            SESSION_STARTED(1),
            SESSION_NO_ACCOUNT(108),
            SWITCH_TO_AR(2),
            SWITCH_TO_THREE_D(3),
            AR_TWIST_ROTATE(4),
            AR_DRAG_ROTATE(5),
            AR_SCALE(6),
            AR_TRANSLATE(7),
            AR_RESET_POSE(8),
            THREE_D_ROTATE(9),
            THREE_D_SCALE(10),
            THREE_D_RESET_POSE(11),
            PERMISSIONS_SEEN(12),
            PERMISSIONS_ACCEPTED(13),
            PERMISSIONS_DENIED(14),
            PERMISSION_WENT_BACK(15),
            OPEN_LINK(16),
            TOGGLE_OCCLUSIONS_OFF(17),
            TOGGLE_OCCLUSIONS_ON(18),
            OCCLUSIONS_REACHED_CONFIDENCE_THRESHOLD(19),
            OCCLUSIONS_NOTIFICATION_LOW_CONFIDENCE(20),
            OCCLUSIONS_NOTIFICATION_MOVE_CLOSER(21),
            INSTANT_PLACEMENT_STARTED(22),
            NOTIFICATION_TOO_DARK(23),
            NOTIFICATION_TOO_FAST(24),
            INSTANT_PLACEMENT_SHOW_ARROWS(25),
            OBJECT_PLACED(26),
            OBJECT_PLACED_WITH_5DOF(93),
            AR_AVAILABLE(27),
            AR_UNAVAILABLE(28),
            AR_UNSUPPORTED_DEVICE_NOT_CAPABLE(31),
            AR_SUPPORTED_NOT_INSTALLED(32),
            AR_SUPPORTED_APK_TOO_OLD(33),
            AR_APK_UNKNOWN_ERROR(34),
            AR_APK_UNKNOWN_TIMED_OUT(35),
            OCCLUSIONS_ENABLED_ON_SESSION(29),
            SNAPSHOT(30),
            SCRIPT_LOAD_MODEL(36),
            SCRIPT_SET_CAR_PAINT(40),
            SCRIPT_SET_AUTO_ENVIRONMENT(63),
            RECORD_VIDEO(37),
            SHARE(38),
            OPEN_GALLERY(39),
            STREAMING_TEST_STARTING(41),
            STREAMING_TEST_FAILED(42),
            STREAMING_TEST_PASSED(43),
            STREAMING_TEST_CANCELLED(88),
            STREAMING_SESSION_USE_MERGED_API(94),
            STREAMING_SESSION_USE_MERGED_STREAM(109),
            STREAMING_TEST_DATA_LOST(90),
            RESUMING_STREAMING_THREE_D(44),
            RESUMING_STREAMING_AR(45),
            INTENT_PREFERRED_STREAMING_MODE_BUT_NOT_ALLOWED(46),
            INTENT_PREFERRED_STREAMING_MODE_BUT_NOT_AVAILABLE(47),
            AR_CORE_VERSION_NOT_SUPPORTED_FOR_STREAMING(110),
            STREAMING_INTENT(48),
            STREAMING_ALLOWED_AND_AVAILABLE(49),
            STREAMING_CODEC_SELECTION_START(50),
            STREAMING_CODEC_SELECTION_DONE(51),
            STREAMING_CODEC_SELECTION_FAILED(64),
            STREAMING_MODE_NOT_ALLOWED_FOR_USER(92),
            STREAMING_HOTSPOTS_ALLOWED(103),
            STREAMING_HOTSPOTS_NOT_ALLOWED(104),
            STREAMING_HOTSPOTS_CONFIG_RECEIVED(105),
            STREAMING_HOTSPOT_SELECTED(106),
            STREAMING_HOTSPOT_DESELECTED(107),
            STREAM_STARTING(52),
            STREAM_CREATION_FAILED(60),
            STREAM_STARTED(53),
            STREAM_CONNECTING(54),
            STREAM_CONNECTED(55),
            STREAM_INTERRUPTED(61),
            STREAM_QUALITY_INTOLERABLE(65),
            STREAM_QUALITY_DEGRADED(69),
            STREAM_QUALITY_RECOVERED(70),
            FALLING_BACK_TO_ON_DEVICE_MODE(62),
            STREAM_DISCONNECTED(56),
            STREAM_FIRST_FRAME_RECEIVED(57),
            STREAM_FIRST_FRAME_RECEIVED_SINCE_RESUME(91),
            STREAM_STOPPING(58),
            STREAM_STOPPED(59),
            STREAM_PAUSED(66),
            STREAM_RESUMED(67),
            PAUSED_STREAM_DISCONNECTED(68),
            VERTICAL_PLACEMENT_ENABLED(71),
            SWITCH_TO_HORIZONTAL_MODE(72),
            SWITCH_TO_VERTICAL_MODE(73),
            VERTICAL_MODE_SNAP_ENABLED_AR_ROTATE(74),
            VERTICAL_MODE_SNAP_DISABLED_AR_ROTATE(75),
            VERTICAL_MODE_HORIZONTAL_TRANSLATE(76),
            VERTICAL_MODE_VERTICAL_TRANSLATE(77),
            SNAP_HIT_TEST_VERTICAL_PLANE(78),
            SNAP_HIT_TEST_NO_HIT_VERTICAL_PLANE(79),
            SNAP_SKIP_VERTICAL_PLANE_OUT_OF_DIST_LIMIT(80),
            SNAP_SKIP_VERTICAL_PLANE_NOT_MOVING_TOWARDS(81),
            SNAP_HIT_TEST_MAGICAL_SURFACE_POINT(82),
            SNAP_HIT_TEST_NO_HIT_MAGICAL_SURFACE_POINT(83),
            SNAP_SKIP_MAGICAL_SURFACE_POINT_OUT_OF_DIST_LIMIT(84),
            SNAP_SKIP_MAGICAL_SURFACE_POINT_NOT_MOVING_TOWARDS(85),
            SNAP_WITH_VERTICAL_PLANE(86),
            SNAP_WITH_MAGICAL_SURFACE_POINT(87),
            VERTICAL_MODE_UI_FADE_AWAY(89),
            POST_PERMISSIONS_REMINDER_SEEN(95),
            POST_PERMISSIONS_REMINDER_ACCEPTED(96),
            POST_PERMISSIONS_REMINDER_DENIED(97),
            MODEL_DISPLAYED(98),
            NOTIFICATION_NO_FEATURES(99),
            TRACKING_FAILURE_TOO_DARK(100),
            TRACKING_FAILURE_TOO_FAST(101),
            TRACKING_FAILURE_NO_FEATURES(102);
            
            public static final int ACTION_UNKNOWN_VALUE = 0;
            public static final int AR_APK_UNKNOWN_ERROR_VALUE = 34;
            public static final int AR_APK_UNKNOWN_TIMED_OUT_VALUE = 35;
            public static final int AR_AVAILABLE_VALUE = 27;
            public static final int AR_CORE_VERSION_NOT_SUPPORTED_FOR_STREAMING_VALUE = 110;
            public static final int AR_DRAG_ROTATE_VALUE = 5;
            public static final int AR_RESET_POSE_VALUE = 8;
            public static final int AR_SCALE_VALUE = 6;
            public static final int AR_SUPPORTED_APK_TOO_OLD_VALUE = 33;
            public static final int AR_SUPPORTED_NOT_INSTALLED_VALUE = 32;
            public static final int AR_TRANSLATE_VALUE = 7;
            public static final int AR_TWIST_ROTATE_VALUE = 4;
            public static final int AR_UNAVAILABLE_VALUE = 28;
            public static final int AR_UNSUPPORTED_DEVICE_NOT_CAPABLE_VALUE = 31;
            public static final int FALLING_BACK_TO_ON_DEVICE_MODE_VALUE = 62;
            public static final int INSTANT_PLACEMENT_SHOW_ARROWS_VALUE = 25;
            public static final int INSTANT_PLACEMENT_STARTED_VALUE = 22;
            public static final int INTENT_PREFERRED_STREAMING_MODE_BUT_NOT_ALLOWED_VALUE = 46;
            public static final int INTENT_PREFERRED_STREAMING_MODE_BUT_NOT_AVAILABLE_VALUE = 47;
            public static final int MODEL_DISPLAYED_VALUE = 98;
            public static final int NOTIFICATION_NO_FEATURES_VALUE = 99;
            public static final int NOTIFICATION_TOO_DARK_VALUE = 23;
            public static final int NOTIFICATION_TOO_FAST_VALUE = 24;
            public static final int OBJECT_PLACED_VALUE = 26;
            public static final int OBJECT_PLACED_WITH_5DOF_VALUE = 93;
            public static final int OCCLUSIONS_ENABLED_ON_SESSION_VALUE = 29;
            public static final int OCCLUSIONS_NOTIFICATION_LOW_CONFIDENCE_VALUE = 20;
            public static final int OCCLUSIONS_NOTIFICATION_MOVE_CLOSER_VALUE = 21;
            public static final int OCCLUSIONS_REACHED_CONFIDENCE_THRESHOLD_VALUE = 19;
            public static final int OPEN_GALLERY_VALUE = 39;
            public static final int OPEN_LINK_VALUE = 16;
            public static final int PAUSED_STREAM_DISCONNECTED_VALUE = 68;
            public static final int PERMISSIONS_ACCEPTED_VALUE = 13;
            public static final int PERMISSIONS_DENIED_VALUE = 14;
            public static final int PERMISSIONS_SEEN_VALUE = 12;
            public static final int PERMISSION_WENT_BACK_VALUE = 15;
            public static final int POST_PERMISSIONS_REMINDER_ACCEPTED_VALUE = 96;
            public static final int POST_PERMISSIONS_REMINDER_DENIED_VALUE = 97;
            public static final int POST_PERMISSIONS_REMINDER_SEEN_VALUE = 95;
            public static final int RECORD_VIDEO_VALUE = 37;
            public static final int RESUMING_STREAMING_AR_VALUE = 45;
            public static final int RESUMING_STREAMING_THREE_D_VALUE = 44;
            public static final int SCRIPT_LOAD_MODEL_VALUE = 36;
            public static final int SCRIPT_SET_AUTO_ENVIRONMENT_VALUE = 63;
            public static final int SCRIPT_SET_CAR_PAINT_VALUE = 40;
            public static final int SESSION_NO_ACCOUNT_VALUE = 108;
            public static final int SESSION_STARTED_VALUE = 1;
            public static final int SHARE_VALUE = 38;
            public static final int SNAPSHOT_VALUE = 30;
            public static final int SNAP_HIT_TEST_MAGICAL_SURFACE_POINT_VALUE = 82;
            public static final int SNAP_HIT_TEST_NO_HIT_MAGICAL_SURFACE_POINT_VALUE = 83;
            public static final int SNAP_HIT_TEST_NO_HIT_VERTICAL_PLANE_VALUE = 79;
            public static final int SNAP_HIT_TEST_VERTICAL_PLANE_VALUE = 78;
            public static final int SNAP_SKIP_MAGICAL_SURFACE_POINT_NOT_MOVING_TOWARDS_VALUE = 85;
            public static final int SNAP_SKIP_MAGICAL_SURFACE_POINT_OUT_OF_DIST_LIMIT_VALUE = 84;
            public static final int SNAP_SKIP_VERTICAL_PLANE_NOT_MOVING_TOWARDS_VALUE = 81;
            public static final int SNAP_SKIP_VERTICAL_PLANE_OUT_OF_DIST_LIMIT_VALUE = 80;
            public static final int SNAP_WITH_MAGICAL_SURFACE_POINT_VALUE = 87;
            public static final int SNAP_WITH_VERTICAL_PLANE_VALUE = 86;
            public static final int STREAMING_ALLOWED_AND_AVAILABLE_VALUE = 49;
            public static final int STREAMING_CODEC_SELECTION_DONE_VALUE = 51;
            public static final int STREAMING_CODEC_SELECTION_FAILED_VALUE = 64;
            public static final int STREAMING_CODEC_SELECTION_START_VALUE = 50;
            public static final int STREAMING_HOTSPOTS_ALLOWED_VALUE = 103;
            public static final int STREAMING_HOTSPOTS_CONFIG_RECEIVED_VALUE = 105;
            public static final int STREAMING_HOTSPOTS_NOT_ALLOWED_VALUE = 104;
            public static final int STREAMING_HOTSPOT_DESELECTED_VALUE = 107;
            public static final int STREAMING_HOTSPOT_SELECTED_VALUE = 106;
            public static final int STREAMING_INTENT_VALUE = 48;
            public static final int STREAMING_MODE_NOT_ALLOWED_FOR_USER_VALUE = 92;
            public static final int STREAMING_SESSION_USE_MERGED_API_VALUE = 94;
            public static final int STREAMING_SESSION_USE_MERGED_STREAM_VALUE = 109;
            public static final int STREAMING_TEST_CANCELLED_VALUE = 88;
            public static final int STREAMING_TEST_DATA_LOST_VALUE = 90;
            public static final int STREAMING_TEST_FAILED_VALUE = 42;
            public static final int STREAMING_TEST_PASSED_VALUE = 43;
            public static final int STREAMING_TEST_STARTING_VALUE = 41;
            public static final int STREAM_CONNECTED_VALUE = 55;
            public static final int STREAM_CONNECTING_VALUE = 54;
            public static final int STREAM_CREATION_FAILED_VALUE = 60;
            public static final int STREAM_DISCONNECTED_VALUE = 56;
            public static final int STREAM_FIRST_FRAME_RECEIVED_SINCE_RESUME_VALUE = 91;
            public static final int STREAM_FIRST_FRAME_RECEIVED_VALUE = 57;
            public static final int STREAM_INTERRUPTED_VALUE = 61;
            public static final int STREAM_PAUSED_VALUE = 66;
            public static final int STREAM_QUALITY_DEGRADED_VALUE = 69;
            public static final int STREAM_QUALITY_INTOLERABLE_VALUE = 65;
            public static final int STREAM_QUALITY_RECOVERED_VALUE = 70;
            public static final int STREAM_RESUMED_VALUE = 67;
            public static final int STREAM_STARTED_VALUE = 53;
            public static final int STREAM_STARTING_VALUE = 52;
            public static final int STREAM_STOPPED_VALUE = 59;
            public static final int STREAM_STOPPING_VALUE = 58;
            public static final int SWITCH_TO_AR_VALUE = 2;
            public static final int SWITCH_TO_HORIZONTAL_MODE_VALUE = 72;
            public static final int SWITCH_TO_THREE_D_VALUE = 3;
            public static final int SWITCH_TO_VERTICAL_MODE_VALUE = 73;
            public static final int THREE_D_RESET_POSE_VALUE = 11;
            public static final int THREE_D_ROTATE_VALUE = 9;
            public static final int THREE_D_SCALE_VALUE = 10;
            public static final int TOGGLE_OCCLUSIONS_OFF_VALUE = 17;
            public static final int TOGGLE_OCCLUSIONS_ON_VALUE = 18;
            public static final int TRACKING_FAILURE_NO_FEATURES_VALUE = 102;
            public static final int TRACKING_FAILURE_TOO_DARK_VALUE = 100;
            public static final int TRACKING_FAILURE_TOO_FAST_VALUE = 101;
            public static final int VERTICAL_MODE_HORIZONTAL_TRANSLATE_VALUE = 76;
            public static final int VERTICAL_MODE_SNAP_DISABLED_AR_ROTATE_VALUE = 75;
            public static final int VERTICAL_MODE_SNAP_ENABLED_AR_ROTATE_VALUE = 74;
            public static final int VERTICAL_MODE_UI_FADE_AWAY_VALUE = 89;
            public static final int VERTICAL_MODE_VERTICAL_TRANSLATE_VALUE = 77;
            public static final int VERTICAL_PLACEMENT_ENABLED_VALUE = 71;
            private static final C62958ce internalValueMap = null;
            private final int value;

            static {
                internalValueMap = new C47918b();
            }

            private Action(int i) {
                this.value = i;
            }

            public static Action forNumber(int i) {
                switch (i) {
                    case 0:
                        return ACTION_UNKNOWN;
                    case 1:
                        return SESSION_STARTED;
                    case 2:
                        return SWITCH_TO_AR;
                    case 3:
                        return SWITCH_TO_THREE_D;
                    case 4:
                        return AR_TWIST_ROTATE;
                    case 5:
                        return AR_DRAG_ROTATE;
                    case 6:
                        return AR_SCALE;
                    case 7:
                        return AR_TRANSLATE;
                    case 8:
                        return AR_RESET_POSE;
                    case 9:
                        return THREE_D_ROTATE;
                    case 10:
                        return THREE_D_SCALE;
                    case 11:
                        return THREE_D_RESET_POSE;
                    case 12:
                        return PERMISSIONS_SEEN;
                    case 13:
                        return PERMISSIONS_ACCEPTED;
                    case 14:
                        return PERMISSIONS_DENIED;
                    case 15:
                        return PERMISSION_WENT_BACK;
                    case 16:
                        return OPEN_LINK;
                    case 17:
                        return TOGGLE_OCCLUSIONS_OFF;
                    case 18:
                        return TOGGLE_OCCLUSIONS_ON;
                    case 19:
                        return OCCLUSIONS_REACHED_CONFIDENCE_THRESHOLD;
                    case 20:
                        return OCCLUSIONS_NOTIFICATION_LOW_CONFIDENCE;
                    case 21:
                        return OCCLUSIONS_NOTIFICATION_MOVE_CLOSER;
                    case 22:
                        return INSTANT_PLACEMENT_STARTED;
                    case 23:
                        return NOTIFICATION_TOO_DARK;
                    case 24:
                        return NOTIFICATION_TOO_FAST;
                    case 25:
                        return INSTANT_PLACEMENT_SHOW_ARROWS;
                    case 26:
                        return OBJECT_PLACED;
                    case 27:
                        return AR_AVAILABLE;
                    case 28:
                        return AR_UNAVAILABLE;
                    case 29:
                        return OCCLUSIONS_ENABLED_ON_SESSION;
                    case 30:
                        return SNAPSHOT;
                    case 31:
                        return AR_UNSUPPORTED_DEVICE_NOT_CAPABLE;
                    case 32:
                        return AR_SUPPORTED_NOT_INSTALLED;
                    case 33:
                        return AR_SUPPORTED_APK_TOO_OLD;
                    case 34:
                        return AR_APK_UNKNOWN_ERROR;
                    case 35:
                        return AR_APK_UNKNOWN_TIMED_OUT;
                    case 36:
                        return SCRIPT_LOAD_MODEL;
                    case 37:
                        return RECORD_VIDEO;
                    case 38:
                        return SHARE;
                    case 39:
                        return OPEN_GALLERY;
                    case 40:
                        return SCRIPT_SET_CAR_PAINT;
                    case 41:
                        return STREAMING_TEST_STARTING;
                    case 42:
                        return STREAMING_TEST_FAILED;
                    case 43:
                        return STREAMING_TEST_PASSED;
                    case 44:
                        return RESUMING_STREAMING_THREE_D;
                    case 45:
                        return RESUMING_STREAMING_AR;
                    case 46:
                        return INTENT_PREFERRED_STREAMING_MODE_BUT_NOT_ALLOWED;
                    case 47:
                        return INTENT_PREFERRED_STREAMING_MODE_BUT_NOT_AVAILABLE;
                    case 48:
                        return STREAMING_INTENT;
                    case 49:
                        return STREAMING_ALLOWED_AND_AVAILABLE;
                    case 50:
                        return STREAMING_CODEC_SELECTION_START;
                    case 51:
                        return STREAMING_CODEC_SELECTION_DONE;
                    case 52:
                        return STREAM_STARTING;
                    case 53:
                        return STREAM_STARTED;
                    case 54:
                        return STREAM_CONNECTING;
                    case 55:
                        return STREAM_CONNECTED;
                    case 56:
                        return STREAM_DISCONNECTED;
                    case 57:
                        return STREAM_FIRST_FRAME_RECEIVED;
                    case 58:
                        return STREAM_STOPPING;
                    case 59:
                        return STREAM_STOPPED;
                    case 60:
                        return STREAM_CREATION_FAILED;
                    case 61:
                        return STREAM_INTERRUPTED;
                    case 62:
                        return FALLING_BACK_TO_ON_DEVICE_MODE;
                    case 63:
                        return SCRIPT_SET_AUTO_ENVIRONMENT;
                    case 64:
                        return STREAMING_CODEC_SELECTION_FAILED;
                    case 65:
                        return STREAM_QUALITY_INTOLERABLE;
                    case 66:
                        return STREAM_PAUSED;
                    case 67:
                        return STREAM_RESUMED;
                    case 68:
                        return PAUSED_STREAM_DISCONNECTED;
                    case 69:
                        return STREAM_QUALITY_DEGRADED;
                    case 70:
                        return STREAM_QUALITY_RECOVERED;
                    case 71:
                        return VERTICAL_PLACEMENT_ENABLED;
                    case 72:
                        return SWITCH_TO_HORIZONTAL_MODE;
                    case 73:
                        return SWITCH_TO_VERTICAL_MODE;
                    case 74:
                        return VERTICAL_MODE_SNAP_ENABLED_AR_ROTATE;
                    case 75:
                        return VERTICAL_MODE_SNAP_DISABLED_AR_ROTATE;
                    case 76:
                        return VERTICAL_MODE_HORIZONTAL_TRANSLATE;
                    case 77:
                        return VERTICAL_MODE_VERTICAL_TRANSLATE;
                    case 78:
                        return SNAP_HIT_TEST_VERTICAL_PLANE;
                    case 79:
                        return SNAP_HIT_TEST_NO_HIT_VERTICAL_PLANE;
                    case 80:
                        return SNAP_SKIP_VERTICAL_PLANE_OUT_OF_DIST_LIMIT;
                    case 81:
                        return SNAP_SKIP_VERTICAL_PLANE_NOT_MOVING_TOWARDS;
                    case 82:
                        return SNAP_HIT_TEST_MAGICAL_SURFACE_POINT;
                    case 83:
                        return SNAP_HIT_TEST_NO_HIT_MAGICAL_SURFACE_POINT;
                    case 84:
                        return SNAP_SKIP_MAGICAL_SURFACE_POINT_OUT_OF_DIST_LIMIT;
                    case 85:
                        return SNAP_SKIP_MAGICAL_SURFACE_POINT_NOT_MOVING_TOWARDS;
                    case 86:
                        return SNAP_WITH_VERTICAL_PLANE;
                    case 87:
                        return SNAP_WITH_MAGICAL_SURFACE_POINT;
                    case 88:
                        return STREAMING_TEST_CANCELLED;
                    case 89:
                        return VERTICAL_MODE_UI_FADE_AWAY;
                    case 90:
                        return STREAMING_TEST_DATA_LOST;
                    case 91:
                        return STREAM_FIRST_FRAME_RECEIVED_SINCE_RESUME;
                    case 92:
                        return STREAMING_MODE_NOT_ALLOWED_FOR_USER;
                    case 93:
                        return OBJECT_PLACED_WITH_5DOF;
                    case 94:
                        return STREAMING_SESSION_USE_MERGED_API;
                    case 95:
                        return POST_PERMISSIONS_REMINDER_SEEN;
                    case 96:
                        return POST_PERMISSIONS_REMINDER_ACCEPTED;
                    case 97:
                        return POST_PERMISSIONS_REMINDER_DENIED;
                    case 98:
                        return MODEL_DISPLAYED;
                    case 99:
                        return NOTIFICATION_NO_FEATURES;
                    case 100:
                        return TRACKING_FAILURE_TOO_DARK;
                    case 101:
                        return TRACKING_FAILURE_TOO_FAST;
                    case 102:
                        return TRACKING_FAILURE_NO_FEATURES;
                    case 103:
                        return STREAMING_HOTSPOTS_ALLOWED;
                    case 104:
                        return STREAMING_HOTSPOTS_NOT_ALLOWED;
                    case 105:
                        return STREAMING_HOTSPOTS_CONFIG_RECEIVED;
                    case 106:
                        return STREAMING_HOTSPOT_SELECTED;
                    case 107:
                        return STREAMING_HOTSPOT_DESELECTED;
                    case 108:
                        return SESSION_NO_ACCOUNT;
                    case 109:
                        return STREAMING_SESSION_USE_MERGED_STREAM;
                    case 110:
                        return AR_CORE_VERSION_NOT_SUPPORTED_FOR_STREAMING;
                    default:
                        return null;
                }
            }

            public static C62958ce internalGetValueMap() {
                return internalValueMap;
            }

            public static C62959cf internalGetVerifier() {
                return C47919c.f124110a;
            }

            public final int getNumber() {
                return this.value;
            }

            public final String toString() {
                return Integer.toString(getNumber());
            }
        }

        /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogEnumOuterClass$ArViewerLogEnum$BuildType */
        /* compiled from: PG */
        public enum BuildType implements C62957cd {
            BUILD_TYPE_UNKNOWN(0),
            AGSA_OTHER(1),
            AGSA_DEV(2),
            AGSA_ALPHA(3),
            AGSA_GAMMA(4),
            AGSA_RELEASE(5),
            STANDALONE(6),
            IGA_OTHER(7),
            IGA_ALPHA(8),
            IGA_BETA(9),
            IGA_RELEASE(10),
            IGA_DEV(11),
            IGA_FISHFOOD(12),
            IGA_DOGFOOD(13);
            
            public static final int AGSA_ALPHA_VALUE = 3;
            public static final int AGSA_DEV_VALUE = 2;
            public static final int AGSA_GAMMA_VALUE = 4;
            public static final int AGSA_OTHER_VALUE = 1;
            public static final int AGSA_RELEASE_VALUE = 5;
            public static final int BUILD_TYPE_UNKNOWN_VALUE = 0;
            @Deprecated
            public static final int IGA_ALPHA_VALUE = 8;
            @Deprecated
            public static final int IGA_BETA_VALUE = 9;
            public static final int IGA_DEV_VALUE = 11;
            public static final int IGA_DOGFOOD_VALUE = 13;
            public static final int IGA_FISHFOOD_VALUE = 12;
            public static final int IGA_OTHER_VALUE = 7;
            public static final int IGA_RELEASE_VALUE = 10;
            public static final int STANDALONE_VALUE = 6;
            private static final C62958ce internalValueMap = null;
            private final int value;

            static {
                internalValueMap = new C47920d();
            }

            private BuildType(int i) {
                this.value = i;
            }

            public static BuildType forNumber(int i) {
                switch (i) {
                    case 0:
                        return BUILD_TYPE_UNKNOWN;
                    case 1:
                        return AGSA_OTHER;
                    case 2:
                        return AGSA_DEV;
                    case 3:
                        return AGSA_ALPHA;
                    case 4:
                        return AGSA_GAMMA;
                    case 5:
                        return AGSA_RELEASE;
                    case 6:
                        return STANDALONE;
                    case 7:
                        return IGA_OTHER;
                    case 8:
                        return IGA_ALPHA;
                    case 9:
                        return IGA_BETA;
                    case 10:
                        return IGA_RELEASE;
                    case 11:
                        return IGA_DEV;
                    case 12:
                        return IGA_FISHFOOD;
                    case 13:
                        return IGA_DOGFOOD;
                    default:
                        return null;
                }
            }

            public static C62958ce internalGetValueMap() {
                return internalValueMap;
            }

            public static C62959cf internalGetVerifier() {
                return C47921e.f124111a;
            }

            public final int getNumber() {
                return this.value;
            }

            public final String toString() {
                return Integer.toString(getNumber());
            }
        }

        /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogEnumOuterClass$ArViewerLogEnum$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements ArViewerLogEnumOrBuilder {
            private Builder() {
                super(ArViewerLogEnum.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(C47917a aVar) {
                this();
            }
        }

        /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogEnumOuterClass$ArViewerLogEnum$ExitReason */
        /* compiled from: PG */
        public enum ExitReason implements C62957cd {
            EXIT_REASON_UNKNOWN(0),
            BACK_BUTTON(1),
            EXIT_BUTTON(2),
            USER_LEFT(3);
            
            public static final int BACK_BUTTON_VALUE = 1;
            public static final int EXIT_BUTTON_VALUE = 2;
            public static final int EXIT_REASON_UNKNOWN_VALUE = 0;
            public static final int USER_LEFT_VALUE = 3;
            private static final C62958ce internalValueMap = null;
            private final int value;

            static {
                internalValueMap = new C47922f();
            }

            private ExitReason(int i) {
                this.value = i;
            }

            public static ExitReason forNumber(int i) {
                if (i == 0) {
                    return EXIT_REASON_UNKNOWN;
                }
                if (i == 1) {
                    return BACK_BUTTON;
                }
                if (i == 2) {
                    return EXIT_BUTTON;
                }
                if (i != 3) {
                    return null;
                }
                return USER_LEFT;
            }

            public static C62958ce internalGetValueMap() {
                return internalValueMap;
            }

            public static C62959cf internalGetVerifier() {
                return C47923g.f124112a;
            }

            public final int getNumber() {
                return this.value;
            }

            public final String toString() {
                return Integer.toString(getNumber());
            }
        }

        /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogEnumOuterClass$ArViewerLogEnum$LoadErrorReason */
        /* compiled from: PG */
        public enum LoadErrorReason implements C62957cd {
            LOAD_ERROR_UNKNOWN(0),
            NO_INTERNET(1),
            INVALID_FILES(2),
            UNABLE_TO_LOAD(3),
            PERSISTENT_ASSETS_FAILED(4);
            
            public static final int INVALID_FILES_VALUE = 2;
            public static final int LOAD_ERROR_UNKNOWN_VALUE = 0;
            public static final int NO_INTERNET_VALUE = 1;
            public static final int PERSISTENT_ASSETS_FAILED_VALUE = 4;
            public static final int UNABLE_TO_LOAD_VALUE = 3;
            private static final C62958ce internalValueMap = null;
            private final int value;

            static {
                internalValueMap = new C47924h();
            }

            private LoadErrorReason(int i) {
                this.value = i;
            }

            public static LoadErrorReason forNumber(int i) {
                if (i == 0) {
                    return LOAD_ERROR_UNKNOWN;
                }
                if (i == 1) {
                    return NO_INTERNET;
                }
                if (i == 2) {
                    return INVALID_FILES;
                }
                if (i == 3) {
                    return UNABLE_TO_LOAD;
                }
                if (i != 4) {
                    return null;
                }
                return PERSISTENT_ASSETS_FAILED;
            }

            public static C62958ce internalGetValueMap() {
                return internalValueMap;
            }

            public static C62959cf internalGetVerifier() {
                return C47925i.f124113a;
            }

            public final int getNumber() {
                return this.value;
            }

            public final String toString() {
                return Integer.toString(getNumber());
            }
        }

        /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogEnumOuterClass$ArViewerLogEnum$LoadStage */
        /* compiled from: PG */
        public enum LoadStage implements C62957cd {
            LOAD_STAGE_NONE(0),
            FETCH_MATERIALS(10),
            DOWNLOAD_MODEL(20),
            CREATE_LOADER(30),
            ADD_MISSING_FILES(40),
            FINISHED_READING_FILES(50),
            CREATE_RENDERABLE(60);
            
            public static final int ADD_MISSING_FILES_VALUE = 40;
            public static final int CREATE_LOADER_VALUE = 30;
            public static final int CREATE_RENDERABLE_VALUE = 60;
            public static final int DOWNLOAD_MODEL_VALUE = 20;
            public static final int FETCH_MATERIALS_VALUE = 10;
            public static final int FINISHED_READING_FILES_VALUE = 50;
            public static final int LOAD_STAGE_NONE_VALUE = 0;
            private static final C62958ce internalValueMap = null;
            private final int value;

            static {
                internalValueMap = new C47926j();
            }

            private LoadStage(int i) {
                this.value = i;
            }

            public static LoadStage forNumber(int i) {
                if (i == 0) {
                    return LOAD_STAGE_NONE;
                }
                if (i == 10) {
                    return FETCH_MATERIALS;
                }
                if (i == 20) {
                    return DOWNLOAD_MODEL;
                }
                if (i == 30) {
                    return CREATE_LOADER;
                }
                if (i == 40) {
                    return ADD_MISSING_FILES;
                }
                if (i == 50) {
                    return FINISHED_READING_FILES;
                }
                if (i != 60) {
                    return null;
                }
                return CREATE_RENDERABLE;
            }

            public static C62958ce internalGetValueMap() {
                return internalValueMap;
            }

            public static C62959cf internalGetVerifier() {
                return C47927k.f124114a;
            }

            public final int getNumber() {
                return this.value;
            }

            public final String toString() {
                return Integer.toString(getNumber());
            }
        }

        /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogEnumOuterClass$ArViewerLogEnum$PerformanceReportReason */
        /* compiled from: PG */
        public enum PerformanceReportReason implements C62957cd {
            PERFORMANCE_REPORT_REASON_UNKNOWN(0),
            PERFORMANCE_AT_PAUSE(1),
            PERFORMANCE_AT_RESUME(2),
            PERFORMANCE_AT_MODE_SWITCH(3),
            PERFORMANCE_AT_LOAD_SUCCESS(4);
            
            public static final int PERFORMANCE_AT_LOAD_SUCCESS_VALUE = 4;
            public static final int PERFORMANCE_AT_MODE_SWITCH_VALUE = 3;
            public static final int PERFORMANCE_AT_PAUSE_VALUE = 1;
            public static final int PERFORMANCE_AT_RESUME_VALUE = 2;
            public static final int PERFORMANCE_REPORT_REASON_UNKNOWN_VALUE = 0;
            private static final C62958ce internalValueMap = null;
            private final int value;

            static {
                internalValueMap = new C47928l();
            }

            private PerformanceReportReason(int i) {
                this.value = i;
            }

            public static PerformanceReportReason forNumber(int i) {
                if (i == 0) {
                    return PERFORMANCE_REPORT_REASON_UNKNOWN;
                }
                if (i == 1) {
                    return PERFORMANCE_AT_PAUSE;
                }
                if (i == 2) {
                    return PERFORMANCE_AT_RESUME;
                }
                if (i == 3) {
                    return PERFORMANCE_AT_MODE_SWITCH;
                }
                if (i != 4) {
                    return null;
                }
                return PERFORMANCE_AT_LOAD_SUCCESS;
            }

            public static C62958ce internalGetValueMap() {
                return internalValueMap;
            }

            public static C62959cf internalGetVerifier() {
                return C47929m.f124115a;
            }

            public final int getNumber() {
                return this.value;
            }

            public final String toString() {
                return Integer.toString(getNumber());
            }
        }

        /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogEnumOuterClass$ArViewerLogEnum$UIEvent */
        /* compiled from: PG */
        public enum UIEvent implements C62957cd {
            UIEVENT_NONE(0),
            PERMISSIONS_CAMERA_SCREEN_SHOWN(1),
            PERMISSIONS_RECORD_MEDIA_SCREEN_SHOWN(2),
            PERMISSIONS_CAMERA_SEEN(3),
            PERMISSIONS_CAMERA_ACCEPTED(4),
            PERMISSIONS_CAMERA_DENIED(5),
            PERMISSIONS_CAMERA_REMINDED(6),
            PERMISSIONS_MICROPHONE_SEEN(7),
            PERMISSIONS_MICROPHONE_ACCEPTED(8),
            PERMISSIONS_MICROPHONE_DENIED(9),
            PERMISSIONS_MICROPHONE_REMINDED(10),
            PERMISSIONS_STORAGE_SEEN(11),
            PERMISSIONS_STORAGE_ACCEPTED(12),
            PERMISSIONS_STORAGE_DENIED(13),
            PERMISSIONS_STORAGE_REMINDED(14);
            
            public static final int PERMISSIONS_CAMERA_ACCEPTED_VALUE = 4;
            public static final int PERMISSIONS_CAMERA_DENIED_VALUE = 5;
            public static final int PERMISSIONS_CAMERA_REMINDED_VALUE = 6;
            public static final int PERMISSIONS_CAMERA_SCREEN_SHOWN_VALUE = 1;
            public static final int PERMISSIONS_CAMERA_SEEN_VALUE = 3;
            public static final int PERMISSIONS_MICROPHONE_ACCEPTED_VALUE = 8;
            public static final int PERMISSIONS_MICROPHONE_DENIED_VALUE = 9;
            public static final int PERMISSIONS_MICROPHONE_REMINDED_VALUE = 10;
            public static final int PERMISSIONS_MICROPHONE_SEEN_VALUE = 7;
            public static final int PERMISSIONS_RECORD_MEDIA_SCREEN_SHOWN_VALUE = 2;
            public static final int PERMISSIONS_STORAGE_ACCEPTED_VALUE = 12;
            public static final int PERMISSIONS_STORAGE_DENIED_VALUE = 13;
            public static final int PERMISSIONS_STORAGE_REMINDED_VALUE = 14;
            public static final int PERMISSIONS_STORAGE_SEEN_VALUE = 11;
            public static final int UIEVENT_NONE_VALUE = 0;
            private static final C62958ce internalValueMap = null;
            private final int value;

            static {
                internalValueMap = new C47930n();
            }

            private UIEvent(int i) {
                this.value = i;
            }

            public static UIEvent forNumber(int i) {
                switch (i) {
                    case 0:
                        return UIEVENT_NONE;
                    case 1:
                        return PERMISSIONS_CAMERA_SCREEN_SHOWN;
                    case 2:
                        return PERMISSIONS_RECORD_MEDIA_SCREEN_SHOWN;
                    case 3:
                        return PERMISSIONS_CAMERA_SEEN;
                    case 4:
                        return PERMISSIONS_CAMERA_ACCEPTED;
                    case 5:
                        return PERMISSIONS_CAMERA_DENIED;
                    case 6:
                        return PERMISSIONS_CAMERA_REMINDED;
                    case 7:
                        return PERMISSIONS_MICROPHONE_SEEN;
                    case 8:
                        return PERMISSIONS_MICROPHONE_ACCEPTED;
                    case 9:
                        return PERMISSIONS_MICROPHONE_DENIED;
                    case 10:
                        return PERMISSIONS_MICROPHONE_REMINDED;
                    case 11:
                        return PERMISSIONS_STORAGE_SEEN;
                    case 12:
                        return PERMISSIONS_STORAGE_ACCEPTED;
                    case 13:
                        return PERMISSIONS_STORAGE_DENIED;
                    case 14:
                        return PERMISSIONS_STORAGE_REMINDED;
                    default:
                        return null;
                }
            }

            public static C62958ce internalGetValueMap() {
                return internalValueMap;
            }

            public static C62959cf internalGetVerifier() {
                return C47931o.f124116a;
            }

            public final int getNumber() {
                return this.value;
            }

            public final String toString() {
                return Integer.toString(getNumber());
            }
        }

        /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogEnumOuterClass$ArViewerLogEnum$ViewerClientVersion */
        /* compiled from: PG */
        public enum ViewerClientVersion implements C62957cd {
            VIEWER_CLIENT_VERSION_UNKNOWN(0),
            SCENEFORM_MODEL_VIEW(1),
            WEB_MODEL_VIEW(2),
            UNSUPPORTED_DEVICE_MODEL_VIEW(3),
            IMP_MODEL_VIEW(4);
            
            public static final int IMP_MODEL_VIEW_VALUE = 4;
            public static final int SCENEFORM_MODEL_VIEW_VALUE = 1;
            public static final int UNSUPPORTED_DEVICE_MODEL_VIEW_VALUE = 3;
            public static final int VIEWER_CLIENT_VERSION_UNKNOWN_VALUE = 0;
            public static final int WEB_MODEL_VIEW_VALUE = 2;
            private static final C62958ce internalValueMap = null;
            private final int value;

            static {
                internalValueMap = new C47932p();
            }

            private ViewerClientVersion(int i) {
                this.value = i;
            }

            public static ViewerClientVersion forNumber(int i) {
                if (i == 0) {
                    return VIEWER_CLIENT_VERSION_UNKNOWN;
                }
                if (i == 1) {
                    return SCENEFORM_MODEL_VIEW;
                }
                if (i == 2) {
                    return WEB_MODEL_VIEW;
                }
                if (i == 3) {
                    return UNSUPPORTED_DEVICE_MODEL_VIEW;
                }
                if (i != 4) {
                    return null;
                }
                return IMP_MODEL_VIEW;
            }

            public static C62958ce internalGetValueMap() {
                return internalValueMap;
            }

            public static C62959cf internalGetVerifier() {
                return C47933q.f124117a;
            }

            public final int getNumber() {
                return this.value;
            }

            public final String toString() {
                return Integer.toString(getNumber());
            }
        }

        /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogEnumOuterClass$ArViewerLogEnum$ViewerMode */
        /* compiled from: PG */
        public enum ViewerMode implements C62957cd {
            VIEWER_MODE_UNKNOWN(0),
            AR(1),
            THREE_D(2),
            SNAPSHOT_MODE(3);
            
            public static final int AR_VALUE = 1;
            public static final int SNAPSHOT_MODE_VALUE = 3;
            public static final int THREE_D_VALUE = 2;
            public static final int VIEWER_MODE_UNKNOWN_VALUE = 0;
            private static final C62958ce internalValueMap = null;
            private final int value;

            static {
                internalValueMap = new C47934r();
            }

            private ViewerMode(int i) {
                this.value = i;
            }

            public static ViewerMode forNumber(int i) {
                if (i == 0) {
                    return VIEWER_MODE_UNKNOWN;
                }
                if (i == 1) {
                    return AR;
                }
                if (i == 2) {
                    return THREE_D;
                }
                if (i != 3) {
                    return null;
                }
                return SNAPSHOT_MODE;
            }

            public static C62958ce internalGetValueMap() {
                return internalValueMap;
            }

            public static C62959cf internalGetVerifier() {
                return C47935s.f124118a;
            }

            public final int getNumber() {
                return this.value;
            }

            public final String toString() {
                return Integer.toString(getNumber());
            }
        }

        static {
            ArViewerLogEnum arViewerLogEnum = new ArViewerLogEnum();
            DEFAULT_INSTANCE = arViewerLogEnum;
            C62942bv.registerDefaultInstance(ArViewerLogEnum.class, arViewerLogEnum);
        }

        private ArViewerLogEnum() {
        }

        public static ArViewerLogEnum getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ArViewerLogEnum parseDelimitedFrom(InputStream inputStream) {
            return (ArViewerLogEnum) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ArViewerLogEnum parseFrom(C63088z zVar) {
            return (ArViewerLogEnum) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
            C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
            switch (buVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0000", (Object[]) null);
                case 3:
                    return new ArViewerLogEnum();
                case 4:
                    return new Builder((C47917a) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (ArViewerLogEnum.class) {
                            ebVar = PARSER;
                            if (ebVar == null) {
                                ebVar = new C62935bo(DEFAULT_INSTANCE);
                                PARSER = ebVar;
                            }
                        }
                    }
                    return ebVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static Builder newBuilder(ArViewerLogEnum arViewerLogEnum) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(arViewerLogEnum);
        }

        public static ArViewerLogEnum parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (ArViewerLogEnum) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static ArViewerLogEnum parseFrom(C63088z zVar, C62921ba baVar) {
            return (ArViewerLogEnum) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static ArViewerLogEnum parseFrom(C62897ae aeVar) {
            return (ArViewerLogEnum) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static ArViewerLogEnum parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (ArViewerLogEnum) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static ArViewerLogEnum parseFrom(InputStream inputStream) {
            return (ArViewerLogEnum) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static ArViewerLogEnum parseFrom(InputStream inputStream, C62921ba baVar) {
            return (ArViewerLogEnum) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static ArViewerLogEnum parseFrom(ByteBuffer byteBuffer) {
            return (ArViewerLogEnum) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static ArViewerLogEnum parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (ArViewerLogEnum) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static ArViewerLogEnum parseFrom(byte[] bArr) {
            return (ArViewerLogEnum) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static ArViewerLogEnum parseFrom(byte[] bArr, C62921ba baVar) {
            return (ArViewerLogEnum) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogEnumOuterClass$ArViewerLogEnumOrBuilder */
    /* compiled from: PG */
    public interface ArViewerLogEnumOrBuilder extends C63001dt {
    }

    private ArViewerLogEnumOuterClass() {
    }

    public static void registerAllExtensions(C62921ba baVar) {
    }
}
