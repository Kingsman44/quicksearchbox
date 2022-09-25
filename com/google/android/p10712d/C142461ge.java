package com.google.android.p10712d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.d.ge */
/* compiled from: PG */
public enum C142461ge implements C62957cd {
    OTA_STATUS_UNKNOWN(0),
    OTA_SUCCESS(1),
    OTA_ERROR_MISSING_FIELD(2),
    OTA_ERROR_ALREADY_RECEIVING(3),
    OTA_ERROR_BUSY_RIGHT_NOW(4),
    OTA_ERROR_NOT_RECEIVING(5),
    OTA_ERROR_BATTERY_LOW(6),
    OTA_ERROR_INVALID_RESUME_VERSION(7),
    OTA_ERROR_INVALID_RESUME_LENGTH(8),
    OTA_ERROR_INVALID_DATA_OFFSET(9),
    OTA_ERROR_FLASH_ERASE_FAILED(10),
    OTA_ERROR_INCORRECT_CHECKSUM(11),
    OTA_ERROR_BOOTLOADER(12),
    OTA_ERROR_OTHER(13),
    OTA_ERROR_INCORRECT_LENGTH(14),
    OTA_ERROR_UNSUPPORTED(15),
    OTA_ERROR_DEVICE_NOT_CONNECTED(16),
    OTA_ERROR_MODEL_UNAVAILABLE_ON_DEVICE_ERROR_ARCH(17),
    OTA_ERROR_MODEL_UNAVAILABLE_ON_DEVICE_ERROR_VER(18),
    OTA_ERROR_MODEL_OVERFLOW(19),
    OTA_ERROR_INVALID_DEVICE_INDEX(20);
    

    /* renamed from: v */
    private final int f386595v;

    private C142461ge(int i) {
        this.f386595v = i;
    }

    /* renamed from: a */
    public static C142461ge m231085a(int i) {
        switch (i) {
            case 0:
                return OTA_STATUS_UNKNOWN;
            case 1:
                return OTA_SUCCESS;
            case 2:
                return OTA_ERROR_MISSING_FIELD;
            case 3:
                return OTA_ERROR_ALREADY_RECEIVING;
            case 4:
                return OTA_ERROR_BUSY_RIGHT_NOW;
            case 5:
                return OTA_ERROR_NOT_RECEIVING;
            case 6:
                return OTA_ERROR_BATTERY_LOW;
            case 7:
                return OTA_ERROR_INVALID_RESUME_VERSION;
            case 8:
                return OTA_ERROR_INVALID_RESUME_LENGTH;
            case 9:
                return OTA_ERROR_INVALID_DATA_OFFSET;
            case 10:
                return OTA_ERROR_FLASH_ERASE_FAILED;
            case 11:
                return OTA_ERROR_INCORRECT_CHECKSUM;
            case 12:
                return OTA_ERROR_BOOTLOADER;
            case 13:
                return OTA_ERROR_OTHER;
            case 14:
                return OTA_ERROR_INCORRECT_LENGTH;
            case 15:
                return OTA_ERROR_UNSUPPORTED;
            case 16:
                return OTA_ERROR_DEVICE_NOT_CONNECTED;
            case 17:
                return OTA_ERROR_MODEL_UNAVAILABLE_ON_DEVICE_ERROR_ARCH;
            case 18:
                return OTA_ERROR_MODEL_UNAVAILABLE_ON_DEVICE_ERROR_VER;
            case 19:
                return OTA_ERROR_MODEL_OVERFLOW;
            case 20:
                return OTA_ERROR_INVALID_DEVICE_INDEX;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m231086b() {
        return C142460gd.f386572a;
    }

    public final int getNumber() {
        return this.f386595v;
    }

    public final String toString() {
        return Integer.toString(this.f386595v);
    }
}
