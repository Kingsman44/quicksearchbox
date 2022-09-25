package androidx.p114h.p115a;

import android.content.res.AssetManager;
import android.system.OsConstants;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.chromium.net.PrivateKeyType;
import p3186j$.util.DesugarTimeZone;

/* renamed from: androidx.h.a.g */
/* compiled from: PG */
public final class C2275g {

    /* renamed from: A */
    private static final C2272d[] f6378A;

    /* renamed from: B */
    private static final C2272d[] f6379B;

    /* renamed from: C */
    private static final C2272d[] f6380C;

    /* renamed from: D */
    private static final C2272d[] f6381D;

    /* renamed from: E */
    private static final C2272d f6382E = new C2272d("StripOffsets", 273, 3);

    /* renamed from: F */
    private static final C2272d[] f6383F;

    /* renamed from: G */
    private static final C2272d[] f6384G;

    /* renamed from: H */
    private static final C2272d[] f6385H;

    /* renamed from: I */
    private static final C2272d[] f6386I;

    /* renamed from: J */
    private static final C2272d[] f6387J = {new C2272d("SubIFDPointer", 330, 4), new C2272d("ExifIFDPointer", 34665, 4), new C2272d("GPSInfoIFDPointer", 34853, 4), new C2272d("InteroperabilityIFDPointer", 40965, 4), new C2272d("CameraSettingsIFDPointer", 8224, 1), new C2272d("ImageProcessingIFDPointer", 8256, 1)};

    /* renamed from: K */
    private static final HashMap[] f6388K = new HashMap[10];

    /* renamed from: L */
    private static final HashMap[] f6389L = new HashMap[10];

    /* renamed from: M */
    private static final HashSet f6390M = new HashSet(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));

    /* renamed from: N */
    private static final HashMap f6391N = new HashMap();

    /* renamed from: O */
    private static final byte[] f6392O;

    /* renamed from: a */
    public static final int[] f6393a = {8, 8, 8};

    /* renamed from: b */
    public static final int[] f6394b = {8};

    /* renamed from: c */
    static final byte[] f6395c = {-1, -40, -1};

    /* renamed from: d */
    static final String[] f6396d = {BuildConfig.FLAVOR, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: e */
    static final int[] f6397e = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: f */
    static final byte[] f6398f = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: g */
    static final C2272d[][] f6399g;

    /* renamed from: h */
    static final Charset f6400h;

    /* renamed from: i */
    static final byte[] f6401i;

    /* renamed from: k */
    private static final boolean f6402k = Log.isLoggable("ExifInterface", 3);

    /* renamed from: l */
    private static final byte[] f6403l = {102, 116, 121, 112};

    /* renamed from: m */
    private static final byte[] f6404m = {109, 105, 102, 49};

    /* renamed from: n */
    private static final byte[] f6405n = {104, 101, 105, 99};

    /* renamed from: o */
    private static final byte[] f6406o = {79, 76, 89, 77, 80, 0};

    /* renamed from: p */
    private static final byte[] f6407p = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: q */
    private static final byte[] f6408q = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: r */
    private static final byte[] f6409r = {101, 88, 73, 102};

    /* renamed from: s */
    private static final byte[] f6410s = {73, 72, 68, 82};

    /* renamed from: t */
    private static final byte[] f6411t = {73, 69, 78, 68};

    /* renamed from: u */
    private static final byte[] f6412u = {82, 73, 70, 70};

    /* renamed from: v */
    private static final byte[] f6413v = {87, 69, 66, 80};

    /* renamed from: w */
    private static final byte[] f6414w = {69, 88, 73, 70};

    /* renamed from: x */
    private static SimpleDateFormat f6415x;

    /* renamed from: y */
    private static SimpleDateFormat f6416y;

    /* renamed from: z */
    private static final C2272d[] f6417z;

    /* renamed from: P */
    private final FileDescriptor f6418P;

    /* renamed from: Q */
    private final AssetManager.AssetInputStream f6419Q;

    /* renamed from: R */
    private int f6420R;

    /* renamed from: S */
    private final HashMap[] f6421S = new HashMap[10];

    /* renamed from: T */
    private final Set f6422T = new HashSet(10);

    /* renamed from: U */
    private boolean f6423U;

    /* renamed from: V */
    private int f6424V;

    /* renamed from: W */
    private int f6425W;

    /* renamed from: X */
    private int f6426X;

    /* renamed from: Y */
    private int f6427Y;

    /* renamed from: j */
    public ByteOrder f6428j = ByteOrder.BIG_ENDIAN;

    static {
        Arrays.asList(new Integer[]{1, 6, 3, 8});
        Arrays.asList(new Integer[]{2, 7, 4, 5});
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        C2272d[] dVarArr = {new C2272d("NewSubfileType", 254, 4), new C2272d("SubfileType", PrivateKeyType.INVALID, 4), new C2272d("ImageWidth", 256, 3, 4), new C2272d("ImageLength", 257, 3, 4), new C2272d("BitsPerSample", 258, 3), new C2272d("Compression", 259, 3), new C2272d("PhotometricInterpretation", 262, 3), new C2272d("ImageDescription", 270, 2), new C2272d("Make", 271, 2), new C2272d("Model", 272, 2), new C2272d("StripOffsets", 273, 3, 4), new C2272d("Orientation", 274, 3), new C2272d("SamplesPerPixel", 277, 3), new C2272d("RowsPerStrip", 278, 3, 4), new C2272d("StripByteCounts", 279, 3, 4), new C2272d("XResolution", 282, 5), new C2272d("YResolution", 283, 5), new C2272d("PlanarConfiguration", 284, 3), new C2272d("ResolutionUnit", 296, 3), new C2272d("TransferFunction", 301, 3), new C2272d("Software", 305, 2), new C2272d("DateTime", 306, 2), new C2272d("Artist", 315, 2), new C2272d("WhitePoint", 318, 5), new C2272d("PrimaryChromaticities", 319, 5), new C2272d("SubIFDPointer", 330, 4), new C2272d("JPEGInterchangeFormat", 513, 4), new C2272d("JPEGInterchangeFormatLength", 514, 4), new C2272d("YCbCrCoefficients", 529, 5), new C2272d("YCbCrSubSampling", 530, 3), new C2272d("YCbCrPositioning", 531, 3), new C2272d("ReferenceBlackWhite", 532, 5), new C2272d("Copyright", 33432, 2), new C2272d("ExifIFDPointer", 34665, 4), new C2272d("GPSInfoIFDPointer", 34853, 4), new C2272d("SensorTopBorder", 4, 4), new C2272d("SensorLeftBorder", 5, 4), new C2272d("SensorBottomBorder", 6, 4), new C2272d("SensorRightBorder", 7, 4), new C2272d("ISO", 23, 3), new C2272d("JpgFromRaw", 46, 7), new C2272d("Xmp", 700, 1)};
        f6417z = dVarArr;
        C2272d[] dVarArr2 = {new C2272d("ExposureTime", 33434, 5), new C2272d("FNumber", 33437, 5), new C2272d("ExposureProgram", 34850, 3), new C2272d("SpectralSensitivity", 34852, 2), new C2272d("PhotographicSensitivity", 34855, 3), new C2272d("OECF", 34856, 7), new C2272d("SensitivityType", 34864, 3), new C2272d("StandardOutputSensitivity", 34865, 4), new C2272d("RecommendedExposureIndex", 34866, 4), new C2272d("ISOSpeed", 34867, 4), new C2272d("ISOSpeedLatitudeyyy", 34868, 4), new C2272d("ISOSpeedLatitudezzz", 34869, 4), new C2272d("ExifVersion", 36864, 2), new C2272d("DateTimeOriginal", 36867, 2), new C2272d("DateTimeDigitized", 36868, 2), new C2272d("OffsetTime", 36880, 2), new C2272d("OffsetTimeOriginal", 36881, 2), new C2272d("OffsetTimeDigitized", 36882, 2), new C2272d("ComponentsConfiguration", 37121, 7), new C2272d("CompressedBitsPerPixel", 37122, 5), new C2272d("ShutterSpeedValue", 37377, 10), new C2272d("ApertureValue", 37378, 5), new C2272d("BrightnessValue", 37379, 10), new C2272d("ExposureBiasValue", 37380, 10), new C2272d("MaxApertureValue", 37381, 5), new C2272d("SubjectDistance", 37382, 5), new C2272d("MeteringMode", 37383, 3), new C2272d("LightSource", 37384, 3), new C2272d("Flash", 37385, 3), new C2272d("FocalLength", 37386, 5), new C2272d("SubjectArea", 37396, 3), new C2272d("MakerNote", 37500, 7), new C2272d("UserComment", 37510, 7), new C2272d("SubSecTime", 37520, 2), new C2272d("SubSecTimeOriginal", 37521, 2), new C2272d("SubSecTimeDigitized", 37522, 2), new C2272d("FlashpixVersion", 40960, 7), new C2272d("ColorSpace", 40961, 3), new C2272d("PixelXDimension", 40962, 3, 4), new C2272d("PixelYDimension", 40963, 3, 4), new C2272d("RelatedSoundFile", 40964, 2), new C2272d("InteroperabilityIFDPointer", 40965, 4), new C2272d("FlashEnergy", 41483, 5), new C2272d("SpatialFrequencyResponse", 41484, 7), new C2272d("FocalPlaneXResolution", 41486, 5), new C2272d("FocalPlaneYResolution", 41487, 5), new C2272d("FocalPlaneResolutionUnit", 41488, 3), new C2272d("SubjectLocation", 41492, 3), new C2272d("ExposureIndex", 41493, 5), new C2272d("SensingMethod", 41495, 3), new C2272d("FileSource", 41728, 7), new C2272d("SceneType", 41729, 7), new C2272d("CFAPattern", 41730, 7), new C2272d("CustomRendered", 41985, 3), new C2272d("ExposureMode", 41986, 3), new C2272d("WhiteBalance", 41987, 3), new C2272d("DigitalZoomRatio", 41988, 5), new C2272d("FocalLengthIn35mmFilm", 41989, 3), new C2272d("SceneCaptureType", 41990, 3), new C2272d("GainControl", 41991, 3), new C2272d("Contrast", 41992, 3), new C2272d("Saturation", 41993, 3), new C2272d("Sharpness", 41994, 3), new C2272d("DeviceSettingDescription", 41995, 7), new C2272d("SubjectDistanceRange", 41996, 3), new C2272d("ImageUniqueID", 42016, 2), new C2272d("CameraOwnerName", 42032, 2), new C2272d("BodySerialNumber", 42033, 2), new C2272d("LensSpecification", 42034, 5), new C2272d("LensMake", 42035, 2), new C2272d("LensModel", 42036, 2), new C2272d("Gamma", 42240, 5), new C2272d("DNGVersion", 50706, 1), new C2272d("DefaultCropSize", 50720, 3, 4)};
        f6378A = dVarArr2;
        C2272d[] dVarArr3 = {new C2272d("GPSVersionID", 0, 1), new C2272d("GPSLatitudeRef", 1, 2), new C2272d("GPSLatitude", 2, 5, 10), new C2272d("GPSLongitudeRef", 3, 2), new C2272d("GPSLongitude", 4, 5, 10), new C2272d("GPSAltitudeRef", 5, 1), new C2272d("GPSAltitude", 6, 5), new C2272d("GPSTimeStamp", 7, 5), new C2272d("GPSSatellites", 8, 2), new C2272d("GPSStatus", 9, 2), new C2272d("GPSMeasureMode", 10, 2), new C2272d("GPSDOP", 11, 5), new C2272d("GPSSpeedRef", 12, 2), new C2272d("GPSSpeed", 13, 5), new C2272d("GPSTrackRef", 14, 2), new C2272d("GPSTrack", 15, 5), new C2272d("GPSImgDirectionRef", 16, 2), new C2272d("GPSImgDirection", 17, 5), new C2272d("GPSMapDatum", 18, 2), new C2272d("GPSDestLatitudeRef", 19, 2), new C2272d("GPSDestLatitude", 20, 5), new C2272d("GPSDestLongitudeRef", 21, 2), new C2272d("GPSDestLongitude", 22, 5), new C2272d("GPSDestBearingRef", 23, 2), new C2272d("GPSDestBearing", 24, 5), new C2272d("GPSDestDistanceRef", 25, 2), new C2272d("GPSDestDistance", 26, 5), new C2272d("GPSProcessingMethod", 27, 7), new C2272d("GPSAreaInformation", 28, 7), new C2272d("GPSDateStamp", 29, 2), new C2272d("GPSDifferential", 30, 3), new C2272d("GPSHPositioningError", 31, 5)};
        f6379B = dVarArr3;
        C2272d[] dVarArr4 = {new C2272d("InteroperabilityIndex", 1, 2)};
        f6380C = dVarArr4;
        C2272d[] dVarArr5 = {new C2272d("NewSubfileType", 254, 4), new C2272d("SubfileType", PrivateKeyType.INVALID, 4), new C2272d("ThumbnailImageWidth", 256, 3, 4), new C2272d("ThumbnailImageLength", 257, 3, 4), new C2272d("BitsPerSample", 258, 3), new C2272d("Compression", 259, 3), new C2272d("PhotometricInterpretation", 262, 3), new C2272d("ImageDescription", 270, 2), new C2272d("Make", 271, 2), new C2272d("Model", 272, 2), new C2272d("StripOffsets", 273, 3, 4), new C2272d("ThumbnailOrientation", 274, 3), new C2272d("SamplesPerPixel", 277, 3), new C2272d("RowsPerStrip", 278, 3, 4), new C2272d("StripByteCounts", 279, 3, 4), new C2272d("XResolution", 282, 5), new C2272d("YResolution", 283, 5), new C2272d("PlanarConfiguration", 284, 3), new C2272d("ResolutionUnit", 296, 3), new C2272d("TransferFunction", 301, 3), new C2272d("Software", 305, 2), new C2272d("DateTime", 306, 2), new C2272d("Artist", 315, 2), new C2272d("WhitePoint", 318, 5), new C2272d("PrimaryChromaticities", 319, 5), new C2272d("SubIFDPointer", 330, 4), new C2272d("JPEGInterchangeFormat", 513, 4), new C2272d("JPEGInterchangeFormatLength", 514, 4), new C2272d("YCbCrCoefficients", 529, 5), new C2272d("YCbCrSubSampling", 530, 3), new C2272d("YCbCrPositioning", 531, 3), new C2272d("ReferenceBlackWhite", 532, 5), new C2272d("Copyright", 33432, 2), new C2272d("ExifIFDPointer", 34665, 4), new C2272d("GPSInfoIFDPointer", 34853, 4), new C2272d("DNGVersion", 50706, 1), new C2272d("DefaultCropSize", 50720, 3, 4)};
        f6381D = dVarArr5;
        C2272d[] dVarArr6 = {new C2272d("ThumbnailImage", 256, 7), new C2272d("CameraSettingsIFDPointer", 8224, 4), new C2272d("ImageProcessingIFDPointer", 8256, 4)};
        f6383F = dVarArr6;
        C2272d[] dVarArr7 = {new C2272d("PreviewImageStart", 257, 4), new C2272d("PreviewImageLength", 258, 4)};
        f6384G = dVarArr7;
        C2272d[] dVarArr8 = {new C2272d("AspectFrame", 4371, 3)};
        f6385H = dVarArr8;
        C2272d[] dVarArr9 = {new C2272d("ColorSpace", 55, 3)};
        f6386I = dVarArr9;
        f6399g = new C2272d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, dVarArr6, dVarArr7, dVarArr8, dVarArr9};
        Charset forName = Charset.forName("US-ASCII");
        f6400h = forName;
        f6401i = "Exif\u0000\u0000".getBytes(forName);
        f6392O = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        f6415x = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        f6416y = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C2272d[][] dVarArr10 = f6399g;
            int length = dVarArr10.length;
            if (i < 10) {
                f6388K[i] = new HashMap();
                f6389L[i] = new HashMap();
                for (C2272d dVar : dVarArr10[i]) {
                    f6388K[i].put(Integer.valueOf(dVar.f6372a), dVar);
                    f6389L[i].put(dVar.f6373b, dVar);
                }
                i++;
            } else {
                HashMap hashMap = f6391N;
                C2272d[] dVarArr11 = f6387J;
                hashMap.put(Integer.valueOf(dVarArr11[0].f6372a), 5);
                hashMap.put(Integer.valueOf(dVarArr11[1].f6372a), 1);
                hashMap.put(Integer.valueOf(dVarArr11[2].f6372a), 2);
                hashMap.put(Integer.valueOf(dVarArr11[3].f6372a), 3);
                hashMap.put(Integer.valueOf(dVarArr11[4].f6372a), 7);
                hashMap.put(Integer.valueOf(dVarArr11[5].f6372a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public C2275g(InputStream inputStream) {
        int length = f6399g.length;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f6419Q = (AssetManager.AssetInputStream) inputStream;
            this.f6418P = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    C2276h.m6213a(fileInputStream.getFD(), 0, OsConstants.SEEK_CUR);
                    this.f6419Q = null;
                    this.f6418P = fileInputStream.getFD();
                } catch (Exception unused) {
                    if (f6402k) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                }
            }
            this.f6419Q = null;
            this.f6418P = null;
        }
        m6197l(inputStream);
    }

    /* renamed from: a */
    public static double m6189a(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split("/", -1);
            double parseDouble2 = Double.parseDouble(split3[0].trim());
            double parseDouble3 = Double.parseDouble(split3[1].trim());
            String[] split4 = split[2].split("/", -1);
            double parseDouble4 = parseDouble + ((parseDouble2 / parseDouble3) / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals("S")) {
                if (!str2.equals("W")) {
                    if (!str2.equals("N")) {
                        if (!str2.equals("E")) {
                            throw new IllegalArgumentException();
                        }
                    }
                    return parseDouble4;
                }
            }
            return -parseDouble4;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    private final void m6190e() {
        String c = mo5669c("DateTimeOriginal");
        if (c != null && mo5669c("DateTime") == null) {
            this.f6421S[0].put("DateTime", C2271c.m6180c(c));
        }
        if (mo5669c("ImageWidth") == null) {
            this.f6421S[0].put("ImageWidth", C2271c.m6181d(0, this.f6428j));
        }
        if (mo5669c("ImageLength") == null) {
            this.f6421S[0].put("ImageLength", C2271c.m6181d(0, this.f6428j));
        }
        if (mo5669c("Orientation") == null) {
            this.f6421S[0].put("Orientation", C2271c.m6181d(0, this.f6428j));
        }
        if (mo5669c("LightSource") == null) {
            this.f6421S[1].put("LightSource", C2271c.m6181d(0, this.f6428j));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x015d A[LOOP:0: B:8:0x0037->B:53:0x015d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0164 A[SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m6191f(androidx.p114h.p115a.C2270b r21, int r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r23
            boolean r3 = f6402k
            java.lang.String r4 = "ExifInterface"
            if (r3 == 0) goto L_0x0021
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "getJpegAttributes starting with: "
            r3.<init>(r5)
            r3.append(r1)
            java.lang.String r3 = r21.toString()
            java.lang.String r3 = r5.concat(r3)
            android.util.Log.d(r4, r3)
        L_0x0021:
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
            r1.f6366c = r3
            byte r3 = r21.readByte()
            java.lang.String r5 = "Invalid marker: "
            r6 = -1
            if (r3 != r6) goto L_0x01a0
            byte r3 = r21.readByte()
            r8 = -40
            if (r3 != r8) goto L_0x018c
            r3 = 2
        L_0x0037:
            byte r5 = r21.readByte()
            if (r5 != r6) goto L_0x0175
            byte r5 = r21.readByte()
            boolean r8 = f6402k
            if (r8 == 0) goto L_0x0058
            r9 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r10 = "Found JPEG segment indicator: "
            java.lang.String r9 = r10.concat(r9)
            android.util.Log.d(r4, r9)
        L_0x0058:
            r9 = -39
            if (r5 == r9) goto L_0x0170
            r9 = -38
            if (r5 != r9) goto L_0x0062
            goto L_0x0170
        L_0x0062:
            int r9 = r21.readUnsignedShort()
            r10 = -2
            int r9 = r9 + r10
            r11 = 4
            int r3 = r3 + r11
            if (r8 == 0) goto L_0x0092
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r12 = "JPEG segment: "
            r8.<init>(r12)
            r12 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r8.append(r12)
            java.lang.String r12 = " (length: "
            r8.append(r12)
            int r12 = r9 + 2
            r8.append(r12)
            java.lang.String r12 = ")"
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r4, r8)
        L_0x0092:
            java.lang.String r8 = "Invalid length"
            if (r9 < 0) goto L_0x016a
            r12 = -31
            r13 = 0
            if (r5 == r12) goto L_0x0105
            r12 = 1
            if (r5 == r10) goto L_0x00e5
            switch(r5) {
                case -64: goto L_0x00ac;
                case -63: goto L_0x00ac;
                case -62: goto L_0x00ac;
                case -61: goto L_0x00ac;
                default: goto L_0x00a1;
            }
        L_0x00a1:
            switch(r5) {
                case -59: goto L_0x00ac;
                case -58: goto L_0x00ac;
                case -57: goto L_0x00ac;
                default: goto L_0x00a4;
            }
        L_0x00a4:
            switch(r5) {
                case -55: goto L_0x00ac;
                case -54: goto L_0x00ac;
                case -53: goto L_0x00ac;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            switch(r5) {
                case -51: goto L_0x00ac;
                case -50: goto L_0x00ac;
                case -49: goto L_0x00ac;
                default: goto L_0x00aa;
            }
        L_0x00aa:
            goto L_0x015b
        L_0x00ac:
            r1.mo5640b(r12)
            java.util.HashMap[] r5 = r0.f6421S
            r5 = r5[r2]
            if (r2 == r11) goto L_0x00b8
            java.lang.String r10 = "ImageLength"
            goto L_0x00ba
        L_0x00b8:
            java.lang.String r10 = "ThumbnailImageLength"
        L_0x00ba:
            int r12 = r21.readUnsignedShort()
            long r12 = (long) r12
            java.nio.ByteOrder r14 = r0.f6428j
            androidx.h.a.c r12 = androidx.p114h.p115a.C2271c.m6181d(r12, r14)
            r5.put(r10, r12)
            java.util.HashMap[] r5 = r0.f6421S
            r5 = r5[r2]
            if (r2 == r11) goto L_0x00d1
            java.lang.String r10 = "ImageWidth"
            goto L_0x00d3
        L_0x00d1:
            java.lang.String r10 = "ThumbnailImageWidth"
        L_0x00d3:
            int r11 = r21.readUnsignedShort()
            long r11 = (long) r11
            java.nio.ByteOrder r13 = r0.f6428j
            androidx.h.a.c r11 = androidx.p114h.p115a.C2271c.m6181d(r11, r13)
            r5.put(r10, r11)
            int r9 = r9 + -5
            goto L_0x015b
        L_0x00e5:
            byte[] r5 = new byte[r9]
            r1.readFully(r5)
            java.lang.String r9 = "UserComment"
            java.lang.String r10 = r0.mo5669c(r9)
            if (r10 != 0) goto L_0x012b
            java.util.HashMap[] r10 = r0.f6421S
            r10 = r10[r12]
            java.lang.String r11 = new java.lang.String
            java.nio.charset.Charset r12 = f6400h
            r11.<init>(r5, r12)
            androidx.h.a.c r5 = androidx.p114h.p115a.C2271c.m6180c(r11)
            r10.put(r9, r5)
            goto L_0x012b
        L_0x0105:
            byte[] r5 = new byte[r9]
            r1.readFully(r5)
            int r10 = r3 + r9
            byte[] r11 = f6401i
            boolean r12 = androidx.p114h.p115a.C2278j.m6217a(r5, r11)
            if (r12 == 0) goto L_0x012d
            int r12 = r11.length
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r12, r9)
            int r3 = r22 + r3
            int r9 = r11.length
            int r3 = r3 + r9
            r0.f6424V = r3
            r0.m6200o(r5, r2)
            androidx.h.a.b r3 = new androidx.h.a.b
            r3.<init>(r5)
            r0.m6203r(r3)
        L_0x012a:
            r3 = r10
        L_0x012b:
            r9 = 0
            goto L_0x015b
        L_0x012d:
            byte[] r11 = f6392O
            boolean r12 = androidx.p114h.p115a.C2278j.m6217a(r5, r11)
            if (r12 == 0) goto L_0x012a
            int r11 = r11.length
            int r3 = r3 + r11
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r11, r9)
            java.lang.String r9 = "Xmp"
            java.lang.String r11 = r0.mo5669c(r9)
            if (r11 != 0) goto L_0x012a
            java.util.HashMap[] r11 = r0.f6421S
            r11 = r11[r13]
            androidx.h.a.c r12 = new androidx.h.a.c
            r15 = 1
            int r14 = r5.length
            long r6 = (long) r3
            r3 = r14
            r14 = r12
            r16 = r3
            r17 = r6
            r19 = r5
            r14.<init>(r15, r16, r17, r19)
            r11.put(r9, r12)
            goto L_0x012a
        L_0x015b:
            if (r9 < 0) goto L_0x0164
            r1.mo5640b(r9)
            int r3 = r3 + r9
            r6 = -1
            goto L_0x0037
        L_0x0164:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r8)
            throw r1
        L_0x016a:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r8)
            throw r1
        L_0x0170:
            java.nio.ByteOrder r2 = r0.f6428j
            r1.f6366c = r2
            return
        L_0x0175:
            java.io.IOException r1 = new java.io.IOException
            r2 = 255(0xff, float:3.57E-43)
            r2 = r2 & r5
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "Invalid marker:"
            java.lang.String r2 = r3.concat(r2)
            r1.<init>(r2)
            throw r1
        L_0x018c:
            r2 = 255(0xff, float:3.57E-43)
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r5.concat(r2)
            r1.<init>(r2)
            throw r1
        L_0x01a0:
            r2 = 255(0xff, float:3.57E-43)
            java.io.IOException r1 = new java.io.IOException
            r2 = r2 & r3
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r5.concat(r2)
            r1.<init>(r2)
            goto L_0x01b6
        L_0x01b5:
            throw r1
        L_0x01b6:
            goto L_0x01b5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p114h.p115a.C2275g.m6191f(androidx.h.a.b, int, int):void");
    }

    /* renamed from: g */
    private final void m6192g(C2270b bVar) {
        if (f6402k) {
            new StringBuilder("getPngAttributes starting with: ").append(bVar);
            Log.d("ExifInterface", "getPngAttributes starting with: ".concat(bVar.toString()));
        }
        bVar.f6366c = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f6408q;
        int length = bArr.length;
        bVar.mo5640b(8);
        int length2 = bArr.length;
        int i = 8;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i2 = i + 8;
                if (i2 == 16) {
                    if (Arrays.equals(bArr2, f6410s)) {
                        i2 = 16;
                    } else {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                }
                if (!Arrays.equals(bArr2, f6411t)) {
                    if (Arrays.equals(bArr2, f6409r)) {
                        byte[] bArr3 = new byte[readInt];
                        bVar.readFully(bArr3);
                        int readInt2 = bVar.readInt();
                        CRC32 crc32 = new CRC32();
                        crc32.update(bArr2);
                        crc32.update(bArr3);
                        if (((int) crc32.getValue()) == readInt2) {
                            this.f6424V = i2;
                            m6200o(bArr3, 0);
                            m6206u();
                            m6203r(new C2270b(bArr3));
                            return;
                        }
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                    }
                    int i3 = readInt + 4;
                    bVar.mo5640b(i3);
                    i = i2 + i3;
                } else {
                    return;
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: h */
    private final void m6193h(C2274f fVar) {
        C2271c cVar;
        m6198m(fVar);
        m6201p(fVar, 0);
        m6205t(fVar, 0);
        m6205t(fVar, 5);
        m6205t(fVar, 4);
        m6206u();
        if (this.f6420R == 8 && (cVar = (C2271c) this.f6421S[1].get("MakerNote")) != null) {
            C2274f fVar2 = new C2274f(cVar.f6371d);
            fVar2.f6366c = this.f6428j;
            fVar2.mo5640b(6);
            m6201p(fVar2, 9);
            C2271c cVar2 = (C2271c) this.f6421S[9].get("ColorSpace");
            if (cVar2 != null) {
                this.f6421S[1].put("ColorSpace", cVar2);
            }
        }
    }

    /* renamed from: i */
    private final void m6194i(C2270b bVar) {
        if (f6402k) {
            new StringBuilder("getWebpAttributes starting with: ").append(bVar);
            Log.d("ExifInterface", "getWebpAttributes starting with: ".concat(bVar.toString()));
        }
        bVar.f6366c = ByteOrder.LITTLE_ENDIAN;
        int length = f6412u.length;
        bVar.mo5640b(4);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f6413v;
        int length2 = bArr.length;
        bVar.mo5640b(4);
        int length3 = bArr.length;
        int i = 12;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int readInt2 = bVar.readInt();
                int i2 = i + 8;
                if (Arrays.equals(f6414w, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    bVar.readFully(bArr3);
                    this.f6424V = i2;
                    m6200o(bArr3, 0);
                    m6203r(new C2270b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                i = i2 + readInt2;
                if (i != readInt) {
                    if (i <= readInt) {
                        bVar.mo5640b(readInt2);
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    return;
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: j */
    private final void m6195j(C2270b bVar, HashMap hashMap) {
        C2271c cVar = (C2271c) hashMap.get("JPEGInterchangeFormat");
        C2271c cVar2 = (C2271c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int b = cVar.mo5662b(this.f6428j);
            int b2 = cVar2.mo5662b(this.f6428j);
            if (this.f6420R == 7) {
                b += this.f6425W;
            }
            if (b > 0 && b2 > 0 && this.f6419Q == null && this.f6418P == null) {
                bVar.mo5640b(b);
                bVar.readFully(new byte[b2]);
            }
            if (f6402k) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + b + ", length: " + b2);
            }
        }
    }

    /* renamed from: k */
    private final void m6196k(C2270b bVar, HashMap hashMap) {
        int length;
        int length2;
        C2270b bVar2 = bVar;
        HashMap hashMap2 = hashMap;
        C2271c cVar = (C2271c) hashMap2.get("StripOffsets");
        C2271c cVar2 = (C2271c) hashMap2.get("StripByteCounts");
        if (cVar != null && cVar2 != null) {
            long[] b = C2278j.m6218b(cVar.mo5663g(this.f6428j));
            long[] b2 = C2278j.m6218b(cVar2.mo5663g(this.f6428j));
            if (b == null || (length = b.length) == 0) {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            } else if (b2 == null || (length2 = b2.length) == 0) {
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            } else if (length == length2) {
                long j = 0;
                for (long j2 : b2) {
                    j += j2;
                }
                byte[] bArr = new byte[((int) j)];
                this.f6423U = true;
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int length3 = b.length;
                    if (i < length3) {
                        int i4 = (int) b[i];
                        int i5 = (int) b2[i];
                        if (i < length3 - 1 && ((long) (i4 + i5)) != b[i + 1]) {
                            this.f6423U = false;
                        }
                        int i6 = i4 - i2;
                        if (i6 < 0) {
                            Log.d("ExifInterface", "Invalid strip offset value");
                            return;
                        }
                        try {
                            bVar2.mo5640b(i6);
                            int i7 = i2 + i6;
                            byte[] bArr2 = new byte[i5];
                            try {
                                bVar2.readFully(bArr2);
                                i2 = i7 + i5;
                                System.arraycopy(bArr2, 0, bArr, i3, i5);
                                i3 += i5;
                                i++;
                            } catch (EOFException unused) {
                                Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                                return;
                            }
                        } catch (EOFException unused2) {
                            Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                            return;
                        }
                    } else if (this.f6423U) {
                        long j3 = b[0];
                        return;
                    } else {
                        return;
                    }
                }
            } else {
                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:152|153|154) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004a, code lost:
        r8 = "FUJIFILMCCD-RAW".getBytes(java.nio.charset.Charset.defaultCharset());
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0056, code lost:
        if (r10 >= r8.length) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005c, code lost:
        if (r9[r10] == r8[r10]) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x029a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x029b, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02a4, code lost:
        throw new java.lang.UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:?, code lost:
        r3.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0062, code lost:
        if (m6208w(r9) == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
        r8 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r8 = new androidx.p114h.p115a.C2270b(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r10 = m6209x(r8);
        r1.f6428j = r10;
        r8.f6366c = r10;
        r10 = r8.readShort();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x050b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x050c, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x050e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0510, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0511, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:?, code lost:
        r3 = f6402k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0514, code lost:
        if (r3 != false) goto L_0x0516;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007b, code lost:
        if (r10 == 20306) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0516, code lost:
        android.util.Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x051b, code lost:
        m6190e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x051e, code lost:
        if (r3 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0520, code lost:
        m6199n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0524, code lost:
        m6190e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0529, code lost:
        if (f6402k != false) goto L_0x052b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x052b, code lost:
        m6199n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x052f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r10 != 21330) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0082, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0088, code lost:
        if (r10 == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
        r8 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008e, code lost:
        r2 = r0;
        r17 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0094, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0095, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0096, code lost:
        if (r17 != null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0098, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009c, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009f, code lost:
        if (r8 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a1, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r8 = new androidx.p114h.p115a.C2270b(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r10 = m6209x(r8);
        r1.f6428j = r10;
        r8.f6366c = r10;
        r10 = r8.readShort();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ba, code lost:
        if (r10 == 85) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bc, code lost:
        r8 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c1, code lost:
        r2 = r0;
        r17 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c8, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c9, code lost:
        if (r17 != null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00cb, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ce, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00cf, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d2, code lost:
        if (r8 != null) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00d4, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00d7, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00d8, code lost:
        r10 = f6408q;
        r11 = r10.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00db, code lost:
        if (r8 >= 8) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00e1, code lost:
        if (r9[r8] != r10[r8]) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00e3, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00e4, code lost:
        r10 = f6412u;
        r11 = r10.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00e7, code lost:
        if (r8 < 4) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00ed, code lost:
        if (r9[r8] != r10[r8]) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00ef, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00f1, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00f4, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00f5, code lost:
        r10 = f6413v;
        r11 = r10.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00f8, code lost:
        if (r8 < 4) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00fa, code lost:
        r11 = f6412u.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0103, code lost:
        if (r9[r8 + 8] != r10[r8]) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0106, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0109, code lost:
        r8 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x010c, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x010f, code lost:
        r8 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0112, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0116, code lost:
        r8 = 9;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:152:0x029d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:157:0x02a8 */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x019f A[Catch:{ RuntimeException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01b4 A[Catch:{ RuntimeException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01c8 A[Catch:{ RuntimeException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01ff A[Catch:{ RuntimeException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0227 A[Catch:{ RuntimeException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x040e A[Catch:{ all -> 0x029a, IOException -> 0x0510, UnsupportedOperationException -> 0x050e }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0414 A[Catch:{ all -> 0x029a, IOException -> 0x0510, UnsupportedOperationException -> 0x050e }] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0507  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x050e A[ExcHandler: UnsupportedOperationException (e java.lang.UnsupportedOperationException), Splitter:B:1:0x000b] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0516 A[Catch:{ all -> 0x050b }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0520  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x010f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:262:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:263:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0098 A[Catch:{ all -> 0x029a, IOException -> 0x0510, UnsupportedOperationException -> 0x050e }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a1 A[Catch:{ all -> 0x029a, IOException -> 0x0510, UnsupportedOperationException -> 0x050e }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00bc A[Catch:{ all -> 0x029a, IOException -> 0x0510, UnsupportedOperationException -> 0x050e }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00cb A[Catch:{ all -> 0x029a, IOException -> 0x0510, UnsupportedOperationException -> 0x050e }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d4 A[Catch:{ all -> 0x029a, IOException -> 0x0510, UnsupportedOperationException -> 0x050e }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00dd A[Catch:{ all -> 0x029a, IOException -> 0x0510, UnsupportedOperationException -> 0x050e }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0129 A[ADDED_TO_REGION] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m6197l(java.io.InputStream r24) {
        /*
            r23 = this;
            r1 = r23
            java.lang.String r2 = "Xmp"
            java.lang.String r3 = "PhotographicSensitivity"
            java.lang.String r4 = "yes"
            java.lang.String r5 = "ExifInterface"
            r7 = 0
        L_0x000b:
            androidx.h.a.d[][] r8 = f6399g     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            int r8 = r8.length     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r8 = 10
            if (r7 >= r8) goto L_0x001e
            java.util.HashMap[] r8 = r1.f6421S     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r9.<init>()     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r8[r7] = r9     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            int r7 = r7 + 1
            goto L_0x000b
        L_0x001e:
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r9 = 5000(0x1388, float:7.006E-42)
            r10 = r24
            r7.<init>(r10, r9)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r7.mark(r9)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            byte[] r9 = new byte[r9]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r7.read(r9)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r7.reset()     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r10 = 0
        L_0x0033:
            byte[] r11 = f6395c     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            int r12 = r11.length     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r14 = 13
            r15 = 9
            r8 = 3
            r6 = 8
            r17 = 0
            r12 = 4
            r19 = 1
            if (r10 >= r8) goto L_0x011f
            byte r8 = r9[r10]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            byte r11 = r11[r10]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            if (r8 == r11) goto L_0x0119
            java.lang.String r8 = "FUJIFILMCCD-RAW"
            java.nio.charset.Charset r10 = java.nio.charset.Charset.defaultCharset()     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            byte[] r8 = r8.getBytes(r10)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r10 = 0
        L_0x0055:
            int r11 = r8.length     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            if (r10 >= r11) goto L_0x0116
            byte r11 = r9[r10]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            byte r13 = r8[r10]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            if (r11 == r13) goto L_0x0112
            boolean r8 = m6208w(r9)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            if (r8 == 0) goto L_0x0068
            r8 = 12
            goto L_0x0120
        L_0x0068:
            androidx.h.a.b r8 = new androidx.h.a.b     // Catch:{ Exception -> 0x009c, all -> 0x0094 }
            r8.<init>(r9)     // Catch:{ Exception -> 0x009c, all -> 0x0094 }
            java.nio.ByteOrder r10 = m6209x(r8)     // Catch:{ Exception -> 0x0092, all -> 0x008d }
            r1.f6428j = r10     // Catch:{ Exception -> 0x0092, all -> 0x008d }
            r8.f6366c = r10     // Catch:{ Exception -> 0x0092, all -> 0x008d }
            short r10 = r8.readShort()     // Catch:{ Exception -> 0x0092, all -> 0x008d }
            r11 = 20306(0x4f52, float:2.8455E-41)
            if (r10 == r11) goto L_0x0084
            r11 = 21330(0x5352, float:2.989E-41)
            if (r10 != r11) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            r10 = 0
            goto L_0x0085
        L_0x0084:
            r10 = 1
        L_0x0085:
            r8.close()     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            if (r10 == 0) goto L_0x00a4
            r8 = 7
            goto L_0x0120
        L_0x008d:
            r0 = move-exception
            r2 = r0
            r17 = r8
            goto L_0x0096
        L_0x0092:
            goto L_0x009f
        L_0x0094:
            r0 = move-exception
            r2 = r0
        L_0x0096:
            if (r17 == 0) goto L_0x009b
            r17.close()     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
        L_0x009b:
            throw r2     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
        L_0x009c:
            r8 = r17
        L_0x009f:
            if (r8 == 0) goto L_0x00a4
            r8.close()     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
        L_0x00a4:
            androidx.h.a.b r8 = new androidx.h.a.b     // Catch:{ Exception -> 0x00cf, all -> 0x00c7 }
            r8.<init>(r9)     // Catch:{ Exception -> 0x00cf, all -> 0x00c7 }
            java.nio.ByteOrder r10 = m6209x(r8)     // Catch:{ Exception -> 0x00c5, all -> 0x00c0 }
            r1.f6428j = r10     // Catch:{ Exception -> 0x00c5, all -> 0x00c0 }
            r8.f6366c = r10     // Catch:{ Exception -> 0x00c5, all -> 0x00c0 }
            short r10 = r8.readShort()     // Catch:{ Exception -> 0x00c5, all -> 0x00c0 }
            r8.close()     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r8 = 85
            if (r10 != r8) goto L_0x00d7
            r8 = 10
            goto L_0x0120
        L_0x00c0:
            r0 = move-exception
            r2 = r0
            r17 = r8
            goto L_0x00c9
        L_0x00c5:
            goto L_0x00d2
        L_0x00c7:
            r0 = move-exception
            r2 = r0
        L_0x00c9:
            if (r17 == 0) goto L_0x00ce
            r17.close()     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
        L_0x00ce:
            throw r2     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
        L_0x00cf:
            r8 = r17
        L_0x00d2:
            if (r8 == 0) goto L_0x00d7
            r8.close()     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
        L_0x00d7:
            r8 = 0
        L_0x00d8:
            byte[] r10 = f6408q     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            int r11 = r10.length     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            if (r8 >= r6) goto L_0x010f
            byte r11 = r9[r8]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            byte r10 = r10[r8]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            if (r11 == r10) goto L_0x010c
            r8 = 0
        L_0x00e4:
            byte[] r10 = f6412u     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            int r11 = r10.length     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            if (r8 >= r12) goto L_0x00f4
            byte r11 = r9[r8]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            byte r10 = r10[r8]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            if (r11 == r10) goto L_0x00f1
        L_0x00ef:
            r8 = 0
            goto L_0x0120
        L_0x00f1:
            int r8 = r8 + 1
            goto L_0x00e4
        L_0x00f4:
            r8 = 0
        L_0x00f5:
            byte[] r10 = f6413v     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            int r11 = r10.length     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            if (r8 >= r12) goto L_0x0109
            byte[] r11 = f6412u     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            int r11 = r11.length     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            int r11 = r8 + 8
            byte r11 = r9[r11]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            byte r10 = r10[r8]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            if (r11 == r10) goto L_0x0106
            goto L_0x00ef
        L_0x0106:
            int r8 = r8 + 1
            goto L_0x00f5
        L_0x0109:
            r8 = 14
            goto L_0x0120
        L_0x010c:
            int r8 = r8 + 1
            goto L_0x00d8
        L_0x010f:
            r8 = 13
            goto L_0x0120
        L_0x0112:
            int r10 = r10 + 1
            goto L_0x0055
        L_0x0116:
            r8 = 9
            goto L_0x0120
        L_0x0119:
            int r10 = r10 + 1
            r8 = 10
            goto L_0x0033
        L_0x011f:
            r8 = 4
        L_0x0120:
            r1.f6420R = r8     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.lang.String r9 = "ImageLength"
            java.lang.String r10 = "ImageWidth"
            r11 = 5
            if (r8 == r12) goto L_0x0403
            if (r8 == r15) goto L_0x0403
            if (r8 == r14) goto L_0x0403
            r13 = 14
            if (r8 != r13) goto L_0x0133
            goto L_0x0403
        L_0x0133:
            androidx.h.a.f r8 = new androidx.h.a.f     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r8.<init>((java.io.InputStream) r7)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            int r7 = r1.f6420R     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r14 = 12
            if (r7 != r14) goto L_0x02a9
            android.media.MediaMetadataRetriever r3 = new android.media.MediaMetadataRetriever     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r3.<init>()     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            androidx.h.a.a r7 = new androidx.h.a.a     // Catch:{ RuntimeException -> 0x029d }
            r7.<init>(r8)     // Catch:{ RuntimeException -> 0x029d }
            androidx.p114h.p115a.C2277i.m6216a(r3, r7)     // Catch:{ RuntimeException -> 0x029d }
            r7 = 33
            java.lang.String r7 = r3.extractMetadata(r7)     // Catch:{ RuntimeException -> 0x029d }
            r11 = 34
            java.lang.String r11 = r3.extractMetadata(r11)     // Catch:{ RuntimeException -> 0x029d }
            r12 = 26
            java.lang.String r12 = r3.extractMetadata(r12)     // Catch:{ RuntimeException -> 0x029d }
            r14 = 17
            java.lang.String r14 = r3.extractMetadata(r14)     // Catch:{ RuntimeException -> 0x029d }
            boolean r12 = r4.equals(r12)     // Catch:{ RuntimeException -> 0x029d }
            if (r12 == 0) goto L_0x0180
            r4 = 29
            java.lang.String r17 = r3.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x029d }
            r4 = 30
            java.lang.String r4 = r3.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x029d }
            r12 = 31
            java.lang.String r12 = r3.extractMetadata(r12)     // Catch:{ RuntimeException -> 0x029d }
        L_0x017b:
            r14 = r12
            r12 = r4
            r4 = r17
            goto L_0x019d
        L_0x0180:
            boolean r4 = r4.equals(r14)     // Catch:{ RuntimeException -> 0x029d }
            if (r4 == 0) goto L_0x0199
            r4 = 18
            java.lang.String r17 = r3.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x029d }
            r4 = 19
            java.lang.String r4 = r3.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x029d }
            r12 = 24
            java.lang.String r12 = r3.extractMetadata(r12)     // Catch:{ RuntimeException -> 0x029d }
            goto L_0x017b
        L_0x0199:
            r4 = r17
            r12 = r4
            r14 = r12
        L_0x019d:
            if (r4 == 0) goto L_0x01b2
            java.util.HashMap[] r15 = r1.f6421S     // Catch:{ RuntimeException -> 0x029d }
            r16 = 0
            r15 = r15[r16]     // Catch:{ RuntimeException -> 0x029d }
            int r6 = java.lang.Integer.parseInt(r4)     // Catch:{ RuntimeException -> 0x029d }
            java.nio.ByteOrder r13 = r1.f6428j     // Catch:{ RuntimeException -> 0x029d }
            androidx.h.a.c r6 = androidx.p114h.p115a.C2271c.m6183f(r6, r13)     // Catch:{ RuntimeException -> 0x029d }
            r15.put(r10, r6)     // Catch:{ RuntimeException -> 0x029d }
        L_0x01b2:
            if (r12 == 0) goto L_0x01c6
            java.util.HashMap[] r6 = r1.f6421S     // Catch:{ RuntimeException -> 0x029d }
            r10 = 0
            r6 = r6[r10]     // Catch:{ RuntimeException -> 0x029d }
            int r10 = java.lang.Integer.parseInt(r12)     // Catch:{ RuntimeException -> 0x029d }
            java.nio.ByteOrder r13 = r1.f6428j     // Catch:{ RuntimeException -> 0x029d }
            androidx.h.a.c r10 = androidx.p114h.p115a.C2271c.m6183f(r10, r13)     // Catch:{ RuntimeException -> 0x029d }
            r6.put(r9, r10)     // Catch:{ RuntimeException -> 0x029d }
        L_0x01c6:
            if (r14 == 0) goto L_0x01f0
            int r6 = java.lang.Integer.parseInt(r14)     // Catch:{ RuntimeException -> 0x029d }
            r9 = 90
            if (r6 == r9) goto L_0x01df
            r9 = 180(0xb4, float:2.52E-43)
            if (r6 == r9) goto L_0x01dd
            r9 = 270(0x10e, float:3.78E-43)
            if (r6 == r9) goto L_0x01da
            r6 = 1
            goto L_0x01e0
        L_0x01da:
            r6 = 8
            goto L_0x01e0
        L_0x01dd:
            r6 = 3
            goto L_0x01e0
        L_0x01df:
            r6 = 6
        L_0x01e0:
            java.util.HashMap[] r9 = r1.f6421S     // Catch:{ RuntimeException -> 0x029d }
            r10 = 0
            r9 = r9[r10]     // Catch:{ RuntimeException -> 0x029d }
            java.lang.String r10 = "Orientation"
            java.nio.ByteOrder r13 = r1.f6428j     // Catch:{ RuntimeException -> 0x029d }
            androidx.h.a.c r6 = androidx.p114h.p115a.C2271c.m6183f(r6, r13)     // Catch:{ RuntimeException -> 0x029d }
            r9.put(r10, r6)     // Catch:{ RuntimeException -> 0x029d }
        L_0x01f0:
            if (r7 == 0) goto L_0x022f
            if (r11 == 0) goto L_0x022f
            int r6 = java.lang.Integer.parseInt(r7)     // Catch:{ RuntimeException -> 0x029d }
            int r7 = java.lang.Integer.parseInt(r11)     // Catch:{ RuntimeException -> 0x029d }
            r9 = 6
            if (r7 <= r9) goto L_0x0227
            long r10 = (long) r6     // Catch:{ RuntimeException -> 0x029d }
            r8.mo5667c(r10)     // Catch:{ RuntimeException -> 0x029d }
            byte[] r10 = new byte[r9]     // Catch:{ RuntimeException -> 0x029d }
            r8.readFully(r10)     // Catch:{ RuntimeException -> 0x029d }
            int r6 = r6 + r9
            int r7 = r7 + -6
            byte[] r9 = f6401i     // Catch:{ RuntimeException -> 0x029d }
            boolean r9 = java.util.Arrays.equals(r10, r9)     // Catch:{ RuntimeException -> 0x029d }
            if (r9 == 0) goto L_0x021f
            byte[] r7 = new byte[r7]     // Catch:{ RuntimeException -> 0x029d }
            r8.readFully(r7)     // Catch:{ RuntimeException -> 0x029d }
            r1.f6424V = r6     // Catch:{ RuntimeException -> 0x029d }
            r6 = 0
            r1.m6200o(r7, r6)     // Catch:{ RuntimeException -> 0x029d }
            goto L_0x022f
        L_0x021f:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ RuntimeException -> 0x029d }
            java.lang.String r4 = "Invalid identifier"
            r2.<init>(r4)     // Catch:{ RuntimeException -> 0x029d }
            throw r2     // Catch:{ RuntimeException -> 0x029d }
        L_0x0227:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ RuntimeException -> 0x029d }
            java.lang.String r4 = "Invalid exif length"
            r2.<init>(r4)     // Catch:{ RuntimeException -> 0x029d }
            throw r2     // Catch:{ RuntimeException -> 0x029d }
        L_0x022f:
            r6 = 41
            java.lang.String r6 = r3.extractMetadata(r6)     // Catch:{ RuntimeException -> 0x029d }
            r7 = 42
            java.lang.String r7 = r3.extractMetadata(r7)     // Catch:{ RuntimeException -> 0x029d }
            if (r6 == 0) goto L_0x026d
            if (r7 == 0) goto L_0x026d
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ RuntimeException -> 0x029d }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ RuntimeException -> 0x029d }
            long r9 = (long) r6     // Catch:{ RuntimeException -> 0x029d }
            r8.mo5667c(r9)     // Catch:{ RuntimeException -> 0x029d }
            byte[] r6 = new byte[r7]     // Catch:{ RuntimeException -> 0x029d }
            r8.readFully(r6)     // Catch:{ RuntimeException -> 0x029d }
            java.lang.String r11 = r1.mo5669c(r2)     // Catch:{ RuntimeException -> 0x029d }
            if (r11 != 0) goto L_0x026d
            java.util.HashMap[] r11 = r1.f6421S     // Catch:{ RuntimeException -> 0x029d }
            r13 = 0
            r11 = r11[r13]     // Catch:{ RuntimeException -> 0x029d }
            androidx.h.a.c r13 = new androidx.h.a.c     // Catch:{ RuntimeException -> 0x029d }
            r18 = 1
            r17 = r13
            r19 = r7
            r20 = r9
            r22 = r6
            r17.<init>(r18, r19, r20, r22)     // Catch:{ RuntimeException -> 0x029d }
            r11.put(r2, r13)     // Catch:{ RuntimeException -> 0x029d }
        L_0x026d:
            boolean r2 = f6402k     // Catch:{ RuntimeException -> 0x029d }
            if (r2 == 0) goto L_0x0295
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x029d }
            r2.<init>()     // Catch:{ RuntimeException -> 0x029d }
            java.lang.String r6 = "Heif meta: "
            r2.append(r6)     // Catch:{ RuntimeException -> 0x029d }
            r2.append(r4)     // Catch:{ RuntimeException -> 0x029d }
            java.lang.String r4 = "x"
            r2.append(r4)     // Catch:{ RuntimeException -> 0x029d }
            r2.append(r12)     // Catch:{ RuntimeException -> 0x029d }
            java.lang.String r4 = ", rotation "
            r2.append(r4)     // Catch:{ RuntimeException -> 0x029d }
            r2.append(r14)     // Catch:{ RuntimeException -> 0x029d }
            java.lang.String r2 = r2.toString()     // Catch:{ RuntimeException -> 0x029d }
            android.util.Log.d(r5, r2)     // Catch:{ RuntimeException -> 0x029d }
        L_0x0295:
            r3.release()     // Catch:{ IOException -> 0x03f8, UnsupportedOperationException -> 0x050e }
            goto L_0x03f8
        L_0x029a:
            r0 = move-exception
            r2 = r0
            goto L_0x02a5
        L_0x029d:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x029a }
            java.lang.String r4 = "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."
            r2.<init>(r4)     // Catch:{ all -> 0x029a }
            throw r2     // Catch:{ all -> 0x029a }
        L_0x02a5:
            r3.release()     // Catch:{ IOException -> 0x02a8, UnsupportedOperationException -> 0x050e }
        L_0x02a8:
            throw r2     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
        L_0x02a9:
            r2 = 7
            if (r7 != r2) goto L_0x0393
            r1.m6193h(r8)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.util.HashMap[] r2 = r1.f6421S     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r2 = r2[r19]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.lang.String r3 = "MakerNote"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            androidx.h.a.c r2 = (androidx.p114h.p115a.C2271c) r2     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            if (r2 == 0) goto L_0x03f8
            androidx.h.a.f r3 = new androidx.h.a.f     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            byte[] r2 = r2.f6371d     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r3.<init>((byte[]) r2)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.nio.ByteOrder r2 = r1.f6428j     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r3.f6366c = r2     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            byte[] r2 = f6406o     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            int r4 = r2.length     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r4 = 6
            byte[] r6 = new byte[r4]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r3.readFully(r6)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r13 = 0
            r3.mo5667c(r13)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            byte[] r4 = f6407p     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            int r7 = r4.length     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r7 = 10
            byte[] r7 = new byte[r7]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r3.readFully(r7)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            boolean r2 = java.util.Arrays.equals(r6, r2)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            if (r2 == 0) goto L_0x02ed
            r6 = 8
            r3.mo5667c(r6)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
        L_0x02eb:
            r2 = 6
            goto L_0x02f9
        L_0x02ed:
            boolean r2 = java.util.Arrays.equals(r7, r4)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            if (r2 == 0) goto L_0x02eb
            r6 = 12
            r3.mo5667c(r6)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            goto L_0x02eb
        L_0x02f9:
            r1.m6201p(r3, r2)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.util.HashMap[] r2 = r1.f6421S     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r3 = 7
            r2 = r2[r3]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.lang.String r4 = "PreviewImageStart"
            java.lang.Object r2 = r2.get(r4)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            androidx.h.a.c r2 = (androidx.p114h.p115a.C2271c) r2     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.util.HashMap[] r4 = r1.f6421S     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r3 = r4[r3]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.lang.String r4 = "PreviewImageLength"
            java.lang.Object r3 = r3.get(r4)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            androidx.h.a.c r3 = (androidx.p114h.p115a.C2271c) r3     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            if (r2 == 0) goto L_0x032b
            if (r3 == 0) goto L_0x032b
            java.util.HashMap[] r4 = r1.f6421S     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r4 = r4[r11]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.lang.String r6 = "JPEGInterchangeFormat"
            r4.put(r6, r2)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.util.HashMap[] r2 = r1.f6421S     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r2 = r2[r11]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.lang.String r4 = "JPEGInterchangeFormatLength"
            r2.put(r4, r3)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
        L_0x032b:
            java.util.HashMap[] r2 = r1.f6421S     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r3 = 8
            r2 = r2[r3]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.lang.String r3 = "AspectFrame"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            androidx.h.a.c r2 = (androidx.p114h.p115a.C2271c) r2     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            if (r2 == 0) goto L_0x03f8
            java.nio.ByteOrder r3 = r1.f6428j     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.lang.Object r2 = r2.mo5663g(r3)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            int[] r2 = (int[]) r2     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            if (r2 == 0) goto L_0x0381
            int r3 = r2.length     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            if (r3 == r12) goto L_0x0349
            goto L_0x0381
        L_0x0349:
            r3 = 2
            r3 = r2[r3]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r4 = 0
            r6 = r2[r4]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            if (r3 <= r6) goto L_0x03f8
            r4 = 3
            r4 = r2[r4]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r2 = r2[r19]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            if (r4 <= r2) goto L_0x03f8
            int r3 = r3 - r6
            int r3 = r3 + 1
            int r4 = r4 - r2
            int r4 = r4 + 1
            if (r3 >= r4) goto L_0x0364
            int r3 = r3 + r4
            int r4 = r3 - r4
            int r3 = r3 - r4
        L_0x0364:
            java.nio.ByteOrder r2 = r1.f6428j     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            androidx.h.a.c r2 = androidx.p114h.p115a.C2271c.m6183f(r3, r2)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.nio.ByteOrder r3 = r1.f6428j     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            androidx.h.a.c r3 = androidx.p114h.p115a.C2271c.m6183f(r4, r3)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.util.HashMap[] r4 = r1.f6421S     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r6 = 0
            r4 = r4[r6]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r4.put(r10, r2)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.util.HashMap[] r2 = r1.f6421S     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r2 = r2[r6]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r2.put(r9, r3)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            goto L_0x03f8
        L_0x0381:
            java.lang.String r3 = "Invalid aspect frame values. frame="
            java.lang.String r2 = java.util.Arrays.toString(r2)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.lang.String r2 = r3.concat(r2)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            android.util.Log.w(r5, r2)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            goto L_0x03f8
        L_0x0393:
            r2 = 10
            if (r7 != r2) goto L_0x03f5
            boolean r2 = f6402k     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            if (r2 == 0) goto L_0x03b3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r2.<init>()     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.lang.String r4 = "getRw2Attributes starting with: "
            r2.append(r4)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r2.append(r8)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.lang.String r2 = r8.toString()     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.lang.String r2 = r4.concat(r2)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            android.util.Log.d(r5, r2)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
        L_0x03b3:
            r1.m6193h(r8)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.util.HashMap[] r2 = r1.f6421S     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r4 = 0
            r2 = r2[r4]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.lang.String r4 = "JpgFromRaw"
            java.lang.Object r2 = r2.get(r4)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            androidx.h.a.c r2 = (androidx.p114h.p115a.C2271c) r2     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            if (r2 == 0) goto L_0x03d2
            androidx.h.a.b r4 = new androidx.h.a.b     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            byte[] r6 = r2.f6371d     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r4.<init>(r6)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            long r6 = r2.f6370c     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            int r2 = (int) r6     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r1.m6191f(r4, r2, r11)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
        L_0x03d2:
            java.util.HashMap[] r2 = r1.f6421S     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r4 = 0
            r2 = r2[r4]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.lang.String r4 = "ISO"
            java.lang.Object r2 = r2.get(r4)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            androidx.h.a.c r2 = (androidx.p114h.p115a.C2271c) r2     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.util.HashMap[] r4 = r1.f6421S     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r4 = r4[r19]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            androidx.h.a.c r4 = (androidx.p114h.p115a.C2271c) r4     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            if (r2 == 0) goto L_0x03f8
            if (r4 != 0) goto L_0x03f8
            java.util.HashMap[] r4 = r1.f6421S     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r4 = r4[r19]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r4.put(r3, r2)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            goto L_0x03f8
        L_0x03f5:
            r1.m6193h(r8)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
        L_0x03f8:
            int r2 = r1.f6424V     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            long r2 = (long) r2     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r8.mo5667c(r2)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r1.m6203r(r8)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            goto L_0x0500
        L_0x0403:
            androidx.h.a.b r2 = new androidx.h.a.b     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r2.<init>(r7, r3)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            int r3 = r1.f6420R     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            if (r3 != r12) goto L_0x0414
            r4 = 0
            r1.m6191f(r2, r4, r4)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            goto L_0x0500
        L_0x0414:
            if (r3 != r14) goto L_0x041b
            r1.m6192g(r2)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            goto L_0x0500
        L_0x041b:
            if (r3 != r15) goto L_0x04f9
            boolean r3 = f6402k     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            if (r3 == 0) goto L_0x0439
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r4.<init>()     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.lang.String r6 = "getRafAttributes starting with: "
            r4.append(r6)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r4.append(r2)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.lang.String r4 = r2.toString()     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.lang.String r4 = r6.concat(r4)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            android.util.Log.d(r5, r4)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
        L_0x0439:
            r4 = 84
            r2.mo5640b(r4)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            byte[] r4 = new byte[r12]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            byte[] r6 = new byte[r12]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            byte[] r7 = new byte[r12]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r2.readFully(r4)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r2.readFully(r6)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r2.readFully(r7)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            int r4 = r4.getInt()     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            int r6 = r6.getInt()     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r7)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            int r7 = r7.getInt()     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            byte[] r6 = new byte[r6]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            int r8 = r2.f6365b     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            int r8 = r4 - r8
            r2.mo5640b(r8)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r2.readFully(r6)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            androidx.h.a.b r8 = new androidx.h.a.b     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r8.<init>(r6)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r1.m6191f(r8, r4, r11)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            int r4 = r2.f6365b     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            int r7 = r7 - r4
            r2.mo5640b(r7)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r2.f6366c = r4     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            int r4 = r2.readInt()     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            if (r3 == 0) goto L_0x049d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r3.<init>()     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.lang.String r6 = "numberOfDirectoryEntry: "
            r3.append(r6)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r3.append(r4)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            android.util.Log.d(r5, r3)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
        L_0x049d:
            r3 = 0
        L_0x049e:
            if (r3 >= r4) goto L_0x0500
            int r6 = r2.readUnsignedShort()     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            int r7 = r2.readUnsignedShort()     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            androidx.h.a.d r8 = f6382E     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            int r8 = r8.f6372a     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            if (r6 != r8) goto L_0x04f2
            short r3 = r2.readShort()     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            short r2 = r2.readShort()     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.nio.ByteOrder r4 = r1.f6428j     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            androidx.h.a.c r4 = androidx.p114h.p115a.C2271c.m6183f(r3, r4)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.nio.ByteOrder r6 = r1.f6428j     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            androidx.h.a.c r6 = androidx.p114h.p115a.C2271c.m6183f(r2, r6)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.util.HashMap[] r7 = r1.f6421S     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r8 = 0
            r7 = r7[r8]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r7.put(r9, r4)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.util.HashMap[] r4 = r1.f6421S     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r4 = r4[r8]     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r4.put(r10, r6)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            boolean r4 = f6402k     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            if (r4 == 0) goto L_0x0500
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r4.<init>()     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.lang.String r6 = "Updated to length: "
            r4.append(r6)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r4.append(r3)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.lang.String r3 = ", width: "
            r4.append(r3)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            r4.append(r2)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            java.lang.String r2 = r4.toString()     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            android.util.Log.d(r5, r2)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            goto L_0x0500
        L_0x04f2:
            r8 = 0
            r2.mo5640b(r7)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
            int r3 = r3 + 1
            goto L_0x049e
        L_0x04f9:
            r4 = 14
            if (r3 != r4) goto L_0x0500
            r1.m6194i(r2)     // Catch:{ IOException -> 0x0510, UnsupportedOperationException -> 0x050e }
        L_0x0500:
            r23.m6190e()
            boolean r2 = f6402k
            if (r2 == 0) goto L_0x0523
            r23.m6199n()
            return
        L_0x050b:
            r0 = move-exception
            r2 = r0
            goto L_0x0524
        L_0x050e:
            r0 = move-exception
            goto L_0x0511
        L_0x0510:
            r0 = move-exception
        L_0x0511:
            r2 = r0
            boolean r3 = f6402k     // Catch:{ all -> 0x050b }
            if (r3 == 0) goto L_0x051b
            java.lang.String r4 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r5, r4, r2)     // Catch:{ all -> 0x050b }
        L_0x051b:
            r23.m6190e()
            if (r3 == 0) goto L_0x0523
            r23.m6199n()
        L_0x0523:
            return
        L_0x0524:
            r23.m6190e()
            boolean r3 = f6402k
            if (r3 == 0) goto L_0x052e
            r23.m6199n()
        L_0x052e:
            goto L_0x0530
        L_0x052f:
            throw r2
        L_0x0530:
            goto L_0x052f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p114h.p115a.C2275g.m6197l(java.io.InputStream):void");
    }

    /* renamed from: m */
    private final void m6198m(C2270b bVar) {
        ByteOrder x = m6209x(bVar);
        this.f6428j = x;
        bVar.f6366c = x;
        int readUnsignedShort = bVar.readUnsignedShort();
        int i = this.f6420R;
        if (i == 7 || i == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt >= 8) {
                int i2 = readInt - 8;
                if (i2 > 0) {
                    bVar.mo5640b(i2);
                    return;
                }
                return;
            }
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        throw new IOException("Invalid start code: ".concat(String.valueOf(Integer.toHexString(readUnsignedShort))));
    }

    /* renamed from: n */
    private final void m6199n() {
        for (int i = 0; i < 10; i++) {
            Log.d("ExifInterface", "The size of tag group[" + i + "]: " + this.f6421S[i].size());
            for (Map.Entry entry : this.f6421S[i].entrySet()) {
                C2271c cVar = (C2271c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.mo5664h(this.f6428j) + "'");
            }
        }
    }

    /* renamed from: o */
    private final void m6200o(byte[] bArr, int i) {
        C2274f fVar = new C2274f(bArr);
        m6198m(fVar);
        m6201p(fVar, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c3, code lost:
        if (r13 != r7) goto L_0x00c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0142  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m6201p(androidx.p114h.p115a.C2274f r30, int r31) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            java.util.Set r3 = r0.f6422T
            int r4 = r1.f6365b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            short r3 = r30.readShort()
            boolean r4 = f6402k
            java.lang.String r5 = "ExifInterface"
            if (r4 == 0) goto L_0x002c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "numberOfDirectoryEntry: "
            r4.<init>(r6)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        L_0x002c:
            if (r3 <= 0) goto L_0x039c
            r4 = 0
            r6 = 0
        L_0x0030:
            r7 = 5
            if (r6 >= r3) goto L_0x0327
            int r12 = r30.readUnsignedShort()
            int r13 = r30.readUnsignedShort()
            int r15 = r30.readInt()
            int r14 = r1.f6365b
            long r9 = (long) r14
            r18 = 4
            long r9 = r9 + r18
            java.util.HashMap[] r14 = f6388K
            r14 = r14[r2]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            java.lang.Object r14 = r14.get(r11)
            androidx.h.a.d r14 = (androidx.p114h.p115a.C2272d) r14
            boolean r21 = f6402k
            r8 = 3
            if (r21 == 0) goto L_0x0086
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r24 = java.lang.Integer.valueOf(r31)
            r7[r4] = r24
            r22 = 1
            r7[r22] = r11
            if (r14 == 0) goto L_0x006a
            java.lang.String r4 = r14.f6373b
            goto L_0x006b
        L_0x006a:
            r4 = 0
        L_0x006b:
            r23 = 2
            r7[r23] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r7[r8] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r20 = 4
            r7[r20] = r4
            java.lang.String r4 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String r4 = java.lang.String.format(r4, r7)
            android.util.Log.d(r5, r4)
        L_0x0086:
            r7 = 7
            if (r14 != 0) goto L_0x00a2
            if (r21 == 0) goto L_0x009c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r8 = "Skip the tag entry since tag number is not defined: "
            r4.<init>(r8)
            r4.append(r12)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        L_0x009c:
            r12 = r3
        L_0x009d:
            r3 = 0
        L_0x009f:
            r7 = 0
            goto L_0x0137
        L_0x00a2:
            if (r13 <= 0) goto L_0x0121
            int[] r4 = f6397e
            int r8 = r4.length
            r8 = 14
            if (r13 < r8) goto L_0x00ad
            goto L_0x0121
        L_0x00ad:
            int r8 = r14.f6374c
            if (r8 == r7) goto L_0x00f2
            if (r13 != r7) goto L_0x00b4
            goto L_0x00f2
        L_0x00b4:
            if (r8 == r13) goto L_0x00f2
            int r12 = r14.f6375d
            if (r12 == r13) goto L_0x00f2
            r7 = 4
            if (r8 == r7) goto L_0x00c2
            if (r12 != r7) goto L_0x00c5
            r7 = 3
            r12 = 4
            goto L_0x00c3
        L_0x00c2:
            r7 = 3
        L_0x00c3:
            if (r13 == r7) goto L_0x00f1
        L_0x00c5:
            r7 = 9
            if (r8 == r7) goto L_0x00cb
            if (r12 != r7) goto L_0x00cf
        L_0x00cb:
            r7 = 8
            if (r13 == r7) goto L_0x00f1
        L_0x00cf:
            if (r21 == 0) goto L_0x009c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "Skip the tag entry since data format ("
            r4.<init>(r7)
            java.lang.String[] r7 = f6396d
            r7 = r7[r13]
            r4.append(r7)
            java.lang.String r7 = ") is unexpected for tag: "
            r4.append(r7)
            java.lang.String r7 = r14.f6373b
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
            goto L_0x009c
        L_0x00f1:
            r7 = 7
        L_0x00f2:
            if (r13 != r7) goto L_0x00f5
            r13 = r8
        L_0x00f5:
            long r7 = (long) r15
            r4 = r4[r13]
            r12 = r3
            long r3 = (long) r4
            long r3 = r3 * r7
            r7 = 0
            int r25 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r25 < 0) goto L_0x010c
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r25 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r25 <= 0) goto L_0x010a
            goto L_0x010c
        L_0x010a:
            r7 = 1
            goto L_0x0137
        L_0x010c:
            if (r21 == 0) goto L_0x009f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Skip the tag entry since the number of components is invalid: "
            r7.<init>(r8)
            r7.append(r15)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r5, r7)
            goto L_0x009f
        L_0x0121:
            r12 = r3
            if (r21 == 0) goto L_0x009d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Skip the tag entry since data format is invalid: "
            r3.<init>(r4)
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r5, r3)
            goto L_0x009d
        L_0x0137:
            if (r7 != 0) goto L_0x0142
            r1.mo5667c(r9)
            r26 = r6
            r25 = r12
            goto L_0x031d
        L_0x0142:
            java.lang.String r7 = "Compression"
            int r8 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r8 <= 0) goto L_0x01d7
            int r8 = r30.readInt()
            if (r21 == 0) goto L_0x0164
            r25 = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r26 = r6
            java.lang.String r6 = "seek to data offset: "
            r12.<init>(r6)
            r12.append(r8)
            java.lang.String r6 = r12.toString()
            android.util.Log.d(r5, r6)
            goto L_0x0168
        L_0x0164:
            r26 = r6
            r25 = r12
        L_0x0168:
            int r6 = r0.f6420R
            r12 = 7
            if (r6 != r12) goto L_0x01cb
            java.lang.String r6 = "MakerNote"
            java.lang.String r12 = r14.f6373b
            boolean r6 = r6.equals(r12)
            if (r6 == 0) goto L_0x017a
            r0.f6425W = r8
            goto L_0x01cb
        L_0x017a:
            r6 = 6
            if (r2 != r6) goto L_0x01cb
            java.lang.String r12 = "ThumbnailImage"
            java.lang.String r6 = r14.f6373b
            boolean r6 = r12.equals(r6)
            if (r6 == 0) goto L_0x01c4
            r0.f6426X = r8
            r0.f6427Y = r15
            java.nio.ByteOrder r6 = r0.f6428j
            r12 = 6
            androidx.h.a.c r6 = androidx.p114h.p115a.C2271c.m6183f(r12, r6)
            int r12 = r0.f6426X
            java.nio.ByteOrder r2 = r0.f6428j
            r27 = r9
            long r9 = (long) r12
            androidx.h.a.c r2 = androidx.p114h.p115a.C2271c.m6181d(r9, r2)
            int r9 = r0.f6427Y
            java.nio.ByteOrder r10 = r0.f6428j
            r19 = r14
            r12 = r15
            long r14 = (long) r9
            androidx.h.a.c r9 = androidx.p114h.p115a.C2271c.m6181d(r14, r10)
            java.util.HashMap[] r10 = r0.f6421S
            r14 = 4
            r10 = r10[r14]
            r10.put(r7, r6)
            java.util.HashMap[] r6 = r0.f6421S
            r6 = r6[r14]
            java.lang.String r10 = "JPEGInterchangeFormat"
            r6.put(r10, r2)
            java.util.HashMap[] r2 = r0.f6421S
            r2 = r2[r14]
            java.lang.String r6 = "JPEGInterchangeFormatLength"
            r2.put(r6, r9)
            goto L_0x01c9
        L_0x01c4:
            r27 = r9
            r19 = r14
            r12 = r15
        L_0x01c9:
            r6 = 6
            goto L_0x01d2
        L_0x01cb:
            r27 = r9
            r19 = r14
            r12 = r15
            r6 = r31
        L_0x01d2:
            long r8 = (long) r8
            r1.mo5667c(r8)
            goto L_0x01e2
        L_0x01d7:
            r26 = r6
            r27 = r9
            r25 = r12
            r19 = r14
            r12 = r15
            r6 = r31
        L_0x01e2:
            java.util.HashMap r2 = f6391N
            java.lang.Object r2 = r2.get(r11)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r21 == 0) goto L_0x0205
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "nextIfdType: "
            r8.<init>(r9)
            r8.append(r2)
            java.lang.String r9 = " byteCount: "
            r8.append(r9)
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r5, r8)
        L_0x0205:
            if (r2 == 0) goto L_0x02a5
            r3 = 3
            if (r13 == r3) goto L_0x022b
            r3 = 4
            if (r13 == r3) goto L_0x0226
            r3 = 8
            if (r13 == r3) goto L_0x0221
            r3 = 9
            if (r13 == r3) goto L_0x021c
            r3 = 13
            if (r13 == r3) goto L_0x021c
            r3 = -1
            goto L_0x0230
        L_0x021c:
            int r3 = r30.readInt()
            goto L_0x022f
        L_0x0221:
            short r3 = r30.readShort()
            goto L_0x022f
        L_0x0226:
            long r3 = r30.mo5638a()
            goto L_0x0230
        L_0x022b:
            int r3 = r30.readUnsignedShort()
        L_0x022f:
            long r3 = (long) r3
        L_0x0230:
            if (r21 == 0) goto L_0x024c
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            r8 = 0
            r6[r8] = r7
            r14 = r19
            java.lang.String r7 = r14.f6373b
            r8 = 1
            r6[r8] = r7
            java.lang.String r7 = "Offset: %d, tagName: %s"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            android.util.Log.d(r5, r6)
        L_0x024c:
            r6 = 0
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x028b
            java.util.Set r6 = r0.f6422T
            int r7 = (int) r3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x026a
            r1.mo5667c(r3)
            int r2 = r2.intValue()
            r0.m6201p(r1, r2)
            goto L_0x029e
        L_0x026a:
            if (r21 == 0) goto L_0x029e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Skip jump into the IFD since it has already been read: IfdType "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r2 = " (at "
            r6.append(r2)
            r6.append(r3)
            java.lang.String r2 = ")"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            android.util.Log.d(r5, r2)
            goto L_0x029e
        L_0x028b:
            if (r21 == 0) goto L_0x029e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "Skip jump into the IFD since its offset is invalid: "
            r2.<init>(r6)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r5, r2)
        L_0x029e:
            r9 = r27
            r1.mo5667c(r9)
            goto L_0x031d
        L_0x02a5:
            r14 = r19
            r9 = r27
            int r2 = r1.f6365b
            int r8 = r0.f6424V
            int r4 = (int) r3
            byte[] r3 = new byte[r4]
            r1.readFully(r3)
            androidx.h.a.c r4 = new androidx.h.a.c
            int r2 = r2 + r8
            r8 = r12
            long r11 = (long) r2
            r2 = r14
            r14 = r4
            r15 = r13
            r16 = r8
            r17 = r11
            r19 = r3
            r14.<init>(r15, r16, r17, r19)
            java.util.HashMap[] r3 = r0.f6421S
            r3 = r3[r6]
            java.lang.String r6 = r2.f6373b
            r3.put(r6, r4)
            java.lang.String r3 = "DNGVersion"
            java.lang.String r6 = r2.f6373b
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x02da
            r3 = 3
            r0.f6420R = r3
        L_0x02da:
            java.lang.String r3 = "Make"
            java.lang.String r6 = r2.f6373b
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L_0x02ee
            java.lang.String r3 = "Model"
            java.lang.String r6 = r2.f6373b
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x02fc
        L_0x02ee:
            java.nio.ByteOrder r3 = r0.f6428j
            java.lang.String r3 = r4.mo5664h(r3)
            java.lang.String r6 = "PENTAX"
            boolean r3 = r3.contains(r6)
            if (r3 != 0) goto L_0x030f
        L_0x02fc:
            java.lang.String r2 = r2.f6373b
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0313
            java.nio.ByteOrder r2 = r0.f6428j
            int r2 = r4.mo5662b(r2)
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r3) goto L_0x0313
        L_0x030f:
            r2 = 8
            r0.f6420R = r2
        L_0x0313:
            int r2 = r1.f6365b
            long r2 = (long) r2
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x031d
            r1.mo5667c(r9)
        L_0x031d:
            int r6 = r26 + 1
            short r6 = (short) r6
            r2 = r31
            r3 = r25
            r4 = 0
            goto L_0x0030
        L_0x0327:
            int r2 = r30.readInt()
            boolean r3 = f6402k
            if (r3 == 0) goto L_0x0342
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r8 = 0
            r4[r8] = r6
            java.lang.String r6 = "nextIfdOffset: %d"
            java.lang.String r4 = java.lang.String.format(r6, r4)
            android.util.Log.d(r5, r4)
        L_0x0342:
            long r8 = (long) r2
            r10 = 0
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x0389
            java.util.Set r4 = r0.f6422T
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r4 = r4.contains(r6)
            if (r4 != 0) goto L_0x0375
            r1.mo5667c(r8)
            java.util.HashMap[] r2 = r0.f6421S
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0367
            r0.m6201p(r1, r3)
            return
        L_0x0367:
            java.util.HashMap[] r2 = r0.f6421S
            r2 = r2[r7]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x039c
            r0.m6201p(r1, r7)
            return
        L_0x0375:
            if (r3 == 0) goto L_0x039c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r5, r1)
            return
        L_0x0389:
            if (r3 == 0) goto L_0x039c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r5, r1)
        L_0x039c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p114h.p115a.C2275g.m6201p(androidx.h.a.f, int):void");
    }

    /* renamed from: q */
    private final void m6202q(int i, String str, String str2) {
        if (!this.f6421S[i].isEmpty() && this.f6421S[i].get(str) != null) {
            HashMap hashMap = this.f6421S[i];
            hashMap.put(str2, (C2271c) hashMap.get(str));
            this.f6421S[i].remove(str);
        }
    }

    /* renamed from: r */
    private final void m6203r(C2270b bVar) {
        C2271c cVar;
        int b;
        HashMap hashMap = this.f6421S[4];
        C2271c cVar2 = (C2271c) hashMap.get("Compression");
        if (cVar2 != null) {
            int b2 = cVar2.mo5662b(this.f6428j);
            if (b2 != 1) {
                if (b2 == 6) {
                    m6195j(bVar, hashMap);
                    return;
                } else if (b2 != 7) {
                    return;
                }
            }
            C2271c cVar3 = (C2271c) hashMap.get("BitsPerSample");
            if (cVar3 != null) {
                int[] iArr = (int[]) cVar3.mo5663g(this.f6428j);
                int[] iArr2 = f6393a;
                if (Arrays.equals(iArr2, iArr) || (this.f6420R == 3 && (cVar = (C2271c) hashMap.get("PhotometricInterpretation")) != null && ((b = cVar.mo5662b(this.f6428j)) != 1 ? !(b != 6 || !Arrays.equals(iArr, iArr2)) : Arrays.equals(iArr, f6394b)))) {
                    m6196k(bVar, hashMap);
                    return;
                }
            }
            if (f6402k) {
                Log.d("ExifInterface", "Unsupported data type value");
                return;
            }
            return;
        }
        m6195j(bVar, hashMap);
    }

    /* renamed from: s */
    private final void m6204s(int i, int i2) {
        if (!this.f6421S[i].isEmpty() && !this.f6421S[i2].isEmpty()) {
            C2271c cVar = (C2271c) this.f6421S[i].get("ImageLength");
            C2271c cVar2 = (C2271c) this.f6421S[i].get("ImageWidth");
            C2271c cVar3 = (C2271c) this.f6421S[i2].get("ImageLength");
            C2271c cVar4 = (C2271c) this.f6421S[i2].get("ImageWidth");
            if (cVar == null || cVar2 == null) {
                if (f6402k) {
                    Log.d("ExifInterface", "First image does not contain valid size information");
                }
            } else if (cVar3 != null && cVar4 != null) {
                int b = cVar.mo5662b(this.f6428j);
                int b2 = cVar2.mo5662b(this.f6428j);
                int b3 = cVar3.mo5662b(this.f6428j);
                int b4 = cVar4.mo5662b(this.f6428j);
                if (b < b3 && b2 < b4) {
                    HashMap[] hashMapArr = this.f6421S;
                    HashMap hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            } else if (f6402k) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
            }
        } else if (f6402k) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    /* renamed from: t */
    private final void m6205t(C2274f fVar, int i) {
        C2271c cVar;
        C2271c cVar2;
        C2271c cVar3 = (C2271c) this.f6421S[i].get("DefaultCropSize");
        C2271c cVar4 = (C2271c) this.f6421S[i].get("SensorTopBorder");
        C2271c cVar5 = (C2271c) this.f6421S[i].get("SensorLeftBorder");
        C2271c cVar6 = (C2271c) this.f6421S[i].get("SensorBottomBorder");
        C2271c cVar7 = (C2271c) this.f6421S[i].get("SensorRightBorder");
        if (cVar3 != null) {
            if (cVar3.f6368a == 5) {
                C2273e[] eVarArr = (C2273e[]) cVar3.mo5663g(this.f6428j);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(String.valueOf(Arrays.toString(eVarArr))));
                    return;
                } else {
                    cVar2 = C2271c.m6182e(eVarArr[0], this.f6428j);
                    cVar = C2271c.m6182e(eVarArr[1], this.f6428j);
                }
            } else {
                int[] iArr = (int[]) cVar3.mo5663g(this.f6428j);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(String.valueOf(Arrays.toString(iArr))));
                    return;
                } else {
                    cVar2 = C2271c.m6183f(iArr[0], this.f6428j);
                    cVar = C2271c.m6183f(iArr[1], this.f6428j);
                }
            }
            this.f6421S[i].put("ImageWidth", cVar2);
            this.f6421S[i].put("ImageLength", cVar);
        } else if (cVar4 == null || cVar5 == null || cVar6 == null || cVar7 == null) {
            C2271c cVar8 = (C2271c) this.f6421S[i].get("ImageLength");
            C2271c cVar9 = (C2271c) this.f6421S[i].get("ImageWidth");
            if (cVar8 == null || cVar9 == null) {
                C2271c cVar10 = (C2271c) this.f6421S[i].get("JPEGInterchangeFormat");
                C2271c cVar11 = (C2271c) this.f6421S[i].get("JPEGInterchangeFormatLength");
                if (cVar10 != null && cVar11 != null) {
                    int b = cVar10.mo5662b(this.f6428j);
                    int b2 = cVar10.mo5662b(this.f6428j);
                    fVar.mo5667c((long) b);
                    byte[] bArr = new byte[b2];
                    fVar.readFully(bArr);
                    m6191f(new C2270b(bArr), b, i);
                }
            }
        } else {
            int b3 = cVar4.mo5662b(this.f6428j);
            int b4 = cVar6.mo5662b(this.f6428j);
            int b5 = cVar7.mo5662b(this.f6428j);
            int b6 = cVar5.mo5662b(this.f6428j);
            if (b4 > b3 && b5 > b6) {
                C2271c f = C2271c.m6183f(b4 - b3, this.f6428j);
                C2271c f2 = C2271c.m6183f(b5 - b6, this.f6428j);
                this.f6421S[i].put("ImageLength", f);
                this.f6421S[i].put("ImageWidth", f2);
            }
        }
    }

    /* renamed from: u */
    private final void m6206u() {
        m6204s(0, 5);
        m6204s(0, 4);
        m6204s(5, 4);
        C2271c cVar = (C2271c) this.f6421S[1].get("PixelXDimension");
        C2271c cVar2 = (C2271c) this.f6421S[1].get("PixelYDimension");
        if (!(cVar == null || cVar2 == null)) {
            this.f6421S[0].put("ImageWidth", cVar);
            this.f6421S[0].put("ImageLength", cVar2);
        }
        if (this.f6421S[4].isEmpty() && m6207v(this.f6421S[5])) {
            HashMap[] hashMapArr = this.f6421S;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!m6207v(this.f6421S[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m6202q(0, "ThumbnailOrientation", "Orientation");
        m6202q(0, "ThumbnailImageLength", "ImageLength");
        m6202q(0, "ThumbnailImageWidth", "ImageWidth");
        m6202q(5, "ThumbnailOrientation", "Orientation");
        m6202q(5, "ThumbnailImageLength", "ImageLength");
        m6202q(5, "ThumbnailImageWidth", "ImageWidth");
        m6202q(4, "Orientation", "ThumbnailOrientation");
        m6202q(4, "ImageLength", "ThumbnailImageLength");
        m6202q(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* renamed from: v */
    private final boolean m6207v(HashMap hashMap) {
        C2271c cVar = (C2271c) hashMap.get("ImageLength");
        C2271c cVar2 = (C2271c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.mo5662b(this.f6428j) <= 512 && cVar2.mo5662b(this.f6428j) <= 512;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x008e A[Catch:{ all -> 0x0087 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x009d  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final boolean m6208w(byte[] r13) {
        /*
            r0 = 0
            r1 = 0
            androidx.h.a.b r2 = new androidx.h.a.b     // Catch:{ Exception -> 0x0089 }
            r2.<init>(r13)     // Catch:{ Exception -> 0x0089 }
            int r13 = r2.readInt()     // Catch:{ Exception -> 0x0084, all -> 0x0081 }
            long r3 = (long) r13     // Catch:{ Exception -> 0x0084, all -> 0x0081 }
            r13 = 4
            byte[] r0 = new byte[r13]     // Catch:{ Exception -> 0x0084, all -> 0x0081 }
            r2.readFully(r0)     // Catch:{ Exception -> 0x0084, all -> 0x0081 }
            byte[] r5 = f6403l     // Catch:{ Exception -> 0x0084, all -> 0x0081 }
            boolean r0 = java.util.Arrays.equals(r0, r5)     // Catch:{ Exception -> 0x0084, all -> 0x0081 }
            if (r0 != 0) goto L_0x001e
            r2.close()
            return r1
        L_0x001e:
            r5 = 8
            r7 = 1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0035
            long r3 = r2.readLong()     // Catch:{ Exception -> 0x0084, all -> 0x0081 }
            r9 = 16
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0031
            goto L_0x0036
        L_0x0031:
            r2.close()
            return r1
        L_0x0035:
            r9 = r5
        L_0x0036:
            r11 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x003d
            r3 = r11
        L_0x003d:
            long r3 = r3 - r9
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0046
            r2.close()
            return r1
        L_0x0046:
            byte[] r13 = new byte[r13]     // Catch:{ Exception -> 0x0084, all -> 0x0081 }
            r5 = 0
            r0 = 0
            r9 = 0
        L_0x004c:
            r10 = 2
            long r10 = r3 >> r10
            int r12 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x007d
            r2.readFully(r13)     // Catch:{ EOFException -> 0x0079 }
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x005b
            goto L_0x0077
        L_0x005b:
            byte[] r10 = f6404m     // Catch:{ Exception -> 0x0084, all -> 0x0081 }
            boolean r10 = java.util.Arrays.equals(r13, r10)     // Catch:{ Exception -> 0x0084, all -> 0x0081 }
            r11 = 1
            if (r10 == 0) goto L_0x0066
            r9 = 1
            goto L_0x006f
        L_0x0066:
            byte[] r10 = f6405n     // Catch:{ Exception -> 0x0084, all -> 0x0081 }
            boolean r10 = java.util.Arrays.equals(r13, r10)     // Catch:{ Exception -> 0x0084, all -> 0x0081 }
            if (r10 == 0) goto L_0x006f
            r0 = 1
        L_0x006f:
            if (r9 == 0) goto L_0x0077
            if (r0 == 0) goto L_0x0077
            r2.close()
            return r11
        L_0x0077:
            long r5 = r5 + r7
            goto L_0x004c
        L_0x0079:
            r2.close()
            return r1
        L_0x007d:
            r2.close()
            goto L_0x009a
        L_0x0081:
            r13 = move-exception
            r0 = r2
            goto L_0x009b
        L_0x0084:
            r13 = move-exception
            r0 = r2
            goto L_0x008a
        L_0x0087:
            r13 = move-exception
            goto L_0x009b
        L_0x0089:
            r13 = move-exception
        L_0x008a:
            boolean r2 = f6402k     // Catch:{ all -> 0x0087 }
            if (r2 == 0) goto L_0x0095
            java.lang.String r2 = "ExifInterface"
            java.lang.String r3 = "Exception parsing HEIF file type box."
            android.util.Log.d(r2, r3, r13)     // Catch:{ all -> 0x0087 }
        L_0x0095:
            if (r0 == 0) goto L_0x009a
            r0.close()
        L_0x009a:
            return r1
        L_0x009b:
            if (r0 == 0) goto L_0x00a0
            r0.close()
        L_0x00a0:
            goto L_0x00a2
        L_0x00a1:
            throw r13
        L_0x00a2:
            goto L_0x00a1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p114h.p115a.C2275g.m6208w(byte[]):boolean");
    }

    /* renamed from: x */
    private static final ByteOrder m6209x(C2270b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f6402k) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (f6402k) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IOException("Invalid byte order: ".concat(String.valueOf(Integer.toHexString(readShort))));
        }
    }

    /* renamed from: b */
    public final C2271c mo5668b(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f6402k) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        int i = 0;
        while (true) {
            int length = f6399g.length;
            if (i >= 10) {
                return null;
            }
            C2271c cVar = (C2271c) this.f6421S[i].get(str);
            if (cVar != null) {
                return cVar;
            }
            i++;
        }
    }

    /* renamed from: c */
    public final String mo5669c(String str) {
        C2271c b = mo5668b(str);
        if (b != null) {
            if (!f6390M.contains(str)) {
                return b.mo5664h(this.f6428j);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = b.f6368a;
                if (i == 5 || i == 10) {
                    C2273e[] eVarArr = (C2273e[]) b.mo5663g(this.f6428j);
                    if (eVarArr == null || eVarArr.length != 3) {
                        Log.w("ExifInterface", "Invalid GPS Timestamp array. array=".concat(String.valueOf(Arrays.toString(eVarArr))));
                        return null;
                    }
                    C2273e eVar = eVarArr[0];
                    C2273e eVar2 = eVarArr[1];
                    C2273e eVar3 = eVarArr[2];
                    return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) eVar.f6376a) / ((float) eVar.f6377b))), Integer.valueOf((int) (((float) eVar2.f6376a) / ((float) eVar2.f6377b))), Integer.valueOf((int) (((float) eVar3.f6376a) / ((float) eVar3.f6377b)))});
                }
                Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + b.f6368a);
                return null;
            }
            try {
                return Double.toString(b.mo5661a(this.f6428j));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    public final int mo5670d() {
        C2271c b = mo5668b("Orientation");
        if (b == null) {
            return 1;
        }
        try {
            return b.mo5662b(this.f6428j);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }
}
