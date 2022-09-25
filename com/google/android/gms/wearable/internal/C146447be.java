package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.wearable.internal.be */
/* compiled from: PG */
public abstract class C146447be extends C8849b implements C146448bf {
    public C146447be() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                GetConfigResponse getConfigResponse = (GetConfigResponse) C8850c.m23492a(parcel, GetConfigResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo123201x();
                break;
            case 3:
                enforceNoDataAvail(parcel);
                mo123182e((PutDataResponse) C8850c.m23492a(parcel, PutDataResponse.CREATOR));
                break;
            case 4:
                GetDataItemResponse getDataItemResponse = (GetDataItemResponse) C8850c.m23492a(parcel, GetDataItemResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo123171A();
                break;
            case 5:
                DataHolder dataHolder = (DataHolder) C8850c.m23492a(parcel, DataHolder.CREATOR);
                enforceNoDataAvail(parcel);
                mo123192o();
                break;
            case 6:
                DeleteDataItemsResponse deleteDataItemsResponse = (DeleteDataItemsResponse) C8850c.m23492a(parcel, DeleteDataItemsResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo123193p();
                break;
            case 7:
                enforceNoDataAvail(parcel);
                mo123184g((SendMessageResponse) C8850c.m23492a(parcel, SendMessageResponse.CREATOR));
                break;
            case 8:
                GetFdForAssetResponse getFdForAssetResponse = (GetFdForAssetResponse) C8850c.m23492a(parcel, GetFdForAssetResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo123173C();
                break;
            case 9:
                enforceNoDataAvail(parcel);
                mo123180c((GetLocalNodeResponse) C8850c.m23492a(parcel, GetLocalNodeResponse.CREATOR));
                break;
            case 10:
                GetConnectedNodesResponse getConnectedNodesResponse = (GetConnectedNodesResponse) C8850c.m23492a(parcel, GetConnectedNodesResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo123203z();
                break;
            case 11:
                enforceNoDataAvail(parcel);
                mo123186i((Status) C8850c.m23492a(parcel, Status.CREATOR));
                break;
            case 12:
                StorageInfoResponse storageInfoResponse = (StorageInfoResponse) C8850c.m23492a(parcel, StorageInfoResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo123174D();
                break;
            case 13:
                GetConfigsResponse getConfigsResponse = (GetConfigsResponse) C8850c.m23492a(parcel, GetConfigsResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo123202y();
                break;
            case 14:
                OpenChannelResponse openChannelResponse = (OpenChannelResponse) C8850c.m23492a(parcel, OpenChannelResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo123175E();
                break;
            case 15:
                CloseChannelResponse closeChannelResponse = (CloseChannelResponse) C8850c.m23492a(parcel, CloseChannelResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo123190m();
                break;
            case 16:
                CloseChannelResponse closeChannelResponse2 = (CloseChannelResponse) C8850c.m23492a(parcel, CloseChannelResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo123191n();
                break;
            case 17:
                GetChannelInputStreamResponse getChannelInputStreamResponse = (GetChannelInputStreamResponse) C8850c.m23492a(parcel, GetChannelInputStreamResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo123195r();
                break;
            case 18:
                GetChannelOutputStreamResponse getChannelOutputStreamResponse = (GetChannelOutputStreamResponse) C8850c.m23492a(parcel, GetChannelOutputStreamResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo123196s();
                break;
            case 19:
                ChannelReceiveFileResponse channelReceiveFileResponse = (ChannelReceiveFileResponse) C8850c.m23492a(parcel, ChannelReceiveFileResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo123188k();
                break;
            case 20:
                ChannelSendFileResponse channelSendFileResponse = (ChannelSendFileResponse) C8850c.m23492a(parcel, ChannelSendFileResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo123189l();
                break;
            case 22:
                enforceNoDataAvail(parcel);
                mo123179b((GetCapabilityResponse) C8850c.m23492a(parcel, GetCapabilityResponse.CREATOR));
                break;
            case 23:
                GetAllCapabilitiesResponse getAllCapabilitiesResponse = (GetAllCapabilitiesResponse) C8850c.m23492a(parcel, GetAllCapabilitiesResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo123194q();
                break;
            case 26:
                enforceNoDataAvail(parcel);
                mo123178a((AddLocalCapabilityResponse) C8850c.m23492a(parcel, AddLocalCapabilityResponse.CREATOR));
                break;
            case 27:
                enforceNoDataAvail(parcel);
                mo123183f((RemoveLocalCapabilityResponse) C8850c.m23492a(parcel, RemoveLocalCapabilityResponse.CREATOR));
                break;
            case 28:
                GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse = (GetCloudSyncOptInOutDoneResponse) C8850c.m23492a(parcel, GetCloudSyncOptInOutDoneResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo123197t();
                break;
            case 29:
                GetCloudSyncSettingResponse getCloudSyncSettingResponse = (GetCloudSyncSettingResponse) C8850c.m23492a(parcel, GetCloudSyncSettingResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo123199v();
                break;
            case 30:
                GetCloudSyncOptInStatusResponse getCloudSyncOptInStatusResponse = (GetCloudSyncOptInStatusResponse) C8850c.m23492a(parcel, GetCloudSyncOptInStatusResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo123198u();
                break;
            case 34:
                enforceNoDataAvail(parcel);
                mo123185h((RpcResponse) C8850c.m23492a(parcel, RpcResponse.CREATOR));
                break;
            case 35:
                GetEapIdResponse getEapIdResponse = (GetEapIdResponse) C8850c.m23492a(parcel, GetEapIdResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo123172B();
                break;
            case 36:
                PerformEapAkaResponse performEapAkaResponse = (PerformEapAkaResponse) C8850c.m23492a(parcel, PerformEapAkaResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo123176F();
                break;
            case 37:
                GetCompanionPackageForNodeResponse getCompanionPackageForNodeResponse = (GetCompanionPackageForNodeResponse) C8850c.m23492a(parcel, GetCompanionPackageForNodeResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo123200w();
                break;
            case 38:
                ConsentResponse consentResponse = (ConsentResponse) C8850c.m23492a(parcel, ConsentResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo123177G();
                break;
            case 39:
                enforceNoDataAvail(parcel);
                mo123181d((GetNodeIdResponse) C8850c.m23492a(parcel, GetNodeIdResponse.CREATOR));
                break;
            case 40:
                AppRecommendationsResponse appRecommendationsResponse = (AppRecommendationsResponse) C8850c.m23492a(parcel, AppRecommendationsResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo123187j();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
