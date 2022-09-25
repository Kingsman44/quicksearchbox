package com.google.p3723ar.core;

import com.google.p3723ar.core.exceptions.AnchorNotSupportedForHostingException;
import com.google.p3723ar.core.exceptions.CameraNotAvailableException;
import com.google.p3723ar.core.exceptions.CloudAnchorsNotConfiguredException;
import com.google.p3723ar.core.exceptions.DataInvalidFormatException;
import com.google.p3723ar.core.exceptions.DataUnsupportedVersionException;
import com.google.p3723ar.core.exceptions.DeadlineExceededException;
import com.google.p3723ar.core.exceptions.FatalException;
import com.google.p3723ar.core.exceptions.FineLocationPermissionNotGrantedException;
import com.google.p3723ar.core.exceptions.GooglePlayServicesLocationLibraryNotLinkedException;
import com.google.p3723ar.core.exceptions.ImageInsufficientQualityException;
import com.google.p3723ar.core.exceptions.MetadataNotFoundException;
import com.google.p3723ar.core.exceptions.MissingGlContextException;
import com.google.p3723ar.core.exceptions.NotTrackingException;
import com.google.p3723ar.core.exceptions.NotYetAvailableException;
import com.google.p3723ar.core.exceptions.PlaybackFailedException;
import com.google.p3723ar.core.exceptions.RecordingFailedException;
import com.google.p3723ar.core.exceptions.ResourceExhaustedException;
import com.google.p3723ar.core.exceptions.SessionNotPausedException;
import com.google.p3723ar.core.exceptions.SessionPausedException;
import com.google.p3723ar.core.exceptions.SessionUnsupportedException;
import com.google.p3723ar.core.exceptions.TextureNotSetException;
import com.google.p3723ar.core.exceptions.UnavailableApkTooOldException;
import com.google.p3723ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.p3723ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.p3723ar.core.exceptions.UnavailableSdkTooOldException;
import com.google.p3723ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import com.google.p3723ar.core.exceptions.UnsupportedConfigurationException;
import org.chromium.net.NetError;

/* renamed from: com.google.ar.core.t */
/* compiled from: PG */
enum C47914t {
    SUCCESS(0, (int) null, (int) null),
    ERROR_INVALID_ARGUMENT(-1, IllegalArgumentException.class, (int) null),
    ERROR_FATAL(-2, FatalException.class, (int) null),
    ERROR_SESSION_PAUSED(-3, SessionPausedException.class, (int) null),
    ERROR_SESSION_NOT_PAUSED(-4, SessionNotPausedException.class, (int) null),
    ERROR_NOT_TRACKING(-5, NotTrackingException.class, (int) null),
    ERROR_TEXTURE_NOT_SET(-6, TextureNotSetException.class, (int) null),
    ERROR_MISSING_GL_CONTEXT(-7, MissingGlContextException.class, (int) null),
    ERROR_UNSUPPORTED_CONFIGURATION(-8, UnsupportedConfigurationException.class, (int) null),
    ERROR_FINE_LOCATION_PERMISSION_NOT_GRANTED(-21, FineLocationPermissionNotGrantedException.class, (int) null),
    ERROR_GOOGLE_PLAY_SERVICES_LOCATION_LIBRARY_NOT_LINKED(-22, GooglePlayServicesLocationLibraryNotLinkedException.class, (int) null),
    ERROR_CAMERA_PERMISSION_NOT_GRANTED(-9, SecurityException.class, "Camera permission is not granted"),
    ERROR_DEADLINE_EXCEEDED(-10, DeadlineExceededException.class, (int) null),
    ERROR_RESOURCE_EXHAUSTED(-11, ResourceExhaustedException.class, (int) null),
    ERROR_NOT_YET_AVAILABLE(-12, NotYetAvailableException.class, (int) null),
    ERROR_CAMERA_NOT_AVAILABLE(-13, CameraNotAvailableException.class, (int) null),
    ERROR_ANCHOR_NOT_SUPPORTED_FOR_HOSTING(-16, AnchorNotSupportedForHostingException.class, (int) null),
    ERROR_IMAGE_INSUFFICIENT_QUALITY(-17, ImageInsufficientQualityException.class, (int) null),
    ERROR_DATA_INVALID_FORMAT(-18, DataInvalidFormatException.class, (int) null),
    ERROR_DATA_UNSUPPORTED_VERSION(-19, DataUnsupportedVersionException.class, (int) null),
    ERROR_ILLEGAL_STATE(-20, IllegalStateException.class, (int) null),
    ERROR_RECORDING_FAILED(-23, RecordingFailedException.class, (int) null),
    ERROR_PLAYBACK_FAILED(-24, PlaybackFailedException.class, (int) null),
    ERROR_SESSION_UNSUPPORTED(-25, SessionUnsupportedException.class, (int) null),
    ERROR_METADATA_NOT_FOUND(-26, MetadataNotFoundException.class, (int) null),
    ERROR_CLOUD_ANCHORS_NOT_CONFIGURED(-14, CloudAnchorsNotConfiguredException.class, (int) null),
    ERROR_INTERNET_PERMISSION_NOT_GRANTED(-15, SecurityException.class, "Internet permission is not granted"),
    UNAVAILABLE_ARCORE_NOT_INSTALLED(-100, UnavailableArcoreNotInstalledException.class, (int) null),
    UNAVAILABLE_DEVICE_NOT_COMPATIBLE(NetError.ERR_CONNECTION_RESET, UnavailableDeviceNotCompatibleException.class, (int) null),
    UNAVAILABLE_APK_TOO_OLD(NetError.ERR_CONNECTION_ABORTED, UnavailableApkTooOldException.class, (int) null),
    UNAVAILABLE_SDK_TOO_OLD(NetError.ERR_CONNECTION_FAILED, UnavailableSdkTooOldException.class, (int) null),
    UNAVAILABLE_USER_DECLINED_INSTALLATION(NetError.ERR_NAME_NOT_RESOLVED, UnavailableUserDeclinedInstallationException.class, (int) null);
    

    /* renamed from: G */
    final int f124092G;

    /* renamed from: H */
    final Class f124093H;

    /* renamed from: I */
    final String f124094I;

    private C47914t(int i, Class cls, String str) {
        this.f124092G = i;
        this.f124093H = cls;
        this.f124094I = str;
    }
}
