package androidx.camera.core.p069a.p070a;

import androidx.core.p097i.C1974i;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.camera.core.a.a.k */
/* compiled from: PG */
public final class C1280k {

    /* renamed from: a */
    static final C1282m[] f3697a = {new C1282m("SubIFDPointer", 330, 4), new C1282m("ExifIFDPointer", 34665, 4), new C1282m("GPSInfoIFDPointer", 34853, 4), new C1282m("InteroperabilityIFDPointer", 40965, 4)};

    /* renamed from: b */
    static final C1282m[][] f3698b;

    /* renamed from: c */
    static final HashSet f3699c = new HashSet(Arrays.asList(new String[]{"FNumber", "ExposureTime", "GPSTimeStamp"}));

    /* renamed from: e */
    public static final /* synthetic */ int f3700e = 0;

    /* renamed from: f */
    private static final C1282m[] f3701f;

    /* renamed from: g */
    private static final C1282m[] f3702g;

    /* renamed from: h */
    private static final C1282m[] f3703h;

    /* renamed from: i */
    private static final C1282m[] f3704i;

    /* renamed from: d */
    public final ByteOrder f3705d;

    /* renamed from: j */
    private final List f3706j;

    static {
        C1282m[] mVarArr = {new C1282m("ImageWidth", 256, 3, 4), new C1282m("ImageLength", 257, 3, 4), new C1282m("Make", 271, 2), new C1282m("Model", 272, 2), new C1282m("Orientation", 274, 3), new C1282m("XResolution", 282, 5), new C1282m("YResolution", 283, 5), new C1282m("ResolutionUnit", 296, 3), new C1282m("Software", 305, 2), new C1282m("DateTime", 306, 2), new C1282m("YCbCrPositioning", 531, 3), new C1282m("SubIFDPointer", 330, 4), new C1282m("ExifIFDPointer", 34665, 4), new C1282m("GPSInfoIFDPointer", 34853, 4)};
        f3701f = mVarArr;
        C1282m[] mVarArr2 = {new C1282m("ExposureTime", 33434, 5), new C1282m("FNumber", 33437, 5), new C1282m("ExposureProgram", 34850, 3), new C1282m("PhotographicSensitivity", 34855, 3), new C1282m("SensitivityType", 34864, 3), new C1282m("ExifVersion", 36864, 2), new C1282m("DateTimeOriginal", 36867, 2), new C1282m("DateTimeDigitized", 36868, 2), new C1282m("ComponentsConfiguration", 37121, 7), new C1282m("ShutterSpeedValue", 37377, 10), new C1282m("ApertureValue", 37378, 5), new C1282m("BrightnessValue", 37379, 10), new C1282m("ExposureBiasValue", 37380, 10), new C1282m("MaxApertureValue", 37381, 5), new C1282m("MeteringMode", 37383, 3), new C1282m("LightSource", 37384, 3), new C1282m("Flash", 37385, 3), new C1282m("FocalLength", 37386, 5), new C1282m("SubSecTime", 37520, 2), new C1282m("SubSecTimeOriginal", 37521, 2), new C1282m("SubSecTimeDigitized", 37522, 2), new C1282m("FlashpixVersion", 40960, 7), new C1282m("ColorSpace", 40961, 3), new C1282m("PixelXDimension", 40962, 3, 4), new C1282m("PixelYDimension", 40963, 3, 4), new C1282m("InteroperabilityIFDPointer", 40965, 4), new C1282m("FocalPlaneResolutionUnit", 41488, 3), new C1282m("SensingMethod", 41495, 3), new C1282m("FileSource", 41728, 7), new C1282m("SceneType", 41729, 7), new C1282m("CustomRendered", 41985, 3), new C1282m("ExposureMode", 41986, 3), new C1282m("WhiteBalance", 41987, 3), new C1282m("SceneCaptureType", 41990, 3), new C1282m("Contrast", 41992, 3), new C1282m("Saturation", 41993, 3), new C1282m("Sharpness", 41994, 3)};
        f3702g = mVarArr2;
        C1282m[] mVarArr3 = {new C1282m("GPSVersionID", 0, 1), new C1282m("GPSLatitudeRef", 1, 2), new C1282m("GPSLatitude", 2, 5, 10), new C1282m("GPSLongitudeRef", 3, 2), new C1282m("GPSLongitude", 4, 5, 10), new C1282m("GPSAltitudeRef", 5, 1), new C1282m("GPSAltitude", 6, 5), new C1282m("GPSTimeStamp", 7, 5), new C1282m("GPSSpeedRef", 12, 2), new C1282m("GPSTrackRef", 14, 2), new C1282m("GPSImgDirectionRef", 16, 2), new C1282m("GPSDestBearingRef", 23, 2), new C1282m("GPSDestDistanceRef", 25, 2)};
        f3703h = mVarArr3;
        C1282m[] mVarArr4 = {new C1282m("InteroperabilityIndex", 1, 2)};
        f3704i = mVarArr4;
        f3698b = new C1282m[][]{mVarArr, mVarArr2, mVarArr3, mVarArr4};
    }

    public C1280k(ByteOrder byteOrder, List list) {
        C1974i.m5315c(list.size() == 4, "Malformed attributes list. Number of IFDs mismatch.");
        this.f3705d = byteOrder;
        this.f3706j = list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Map mo4144a(int i) {
        C1974i.m5316d(i, 0, 4, "Invalid IFD index: " + i + ". Index should be between [0, EXIF_TAGS.length] ");
        return (Map) this.f3706j.get(i);
    }
}
